package kz.middle.middle01liquibase.service.impl;

import kz.middle.middle01liquibase.dto.AttachmentFileDto;
import kz.middle.middle01liquibase.dto.TaskDto;
import kz.middle.middle01liquibase.feign.FileFeignClient;
import kz.middle.middle01liquibase.mapper.AttachmentMapper;
import kz.middle.middle01liquibase.repository.AttachmentFileRepository;
import kz.middle.middle01liquibase.service.FileService;
import kz.middle.middle01liquibase.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

    private final FileFeignClient fileFeignClient;
    private final AttachmentFileRepository attachmentFileRepository;
    private final AttachmentMapper attachmentMapper;
    private final TaskService taskService;

    @Override
    public AttachmentFileDto uploadFile(Long taskId, MultipartFile file) {
        TaskDto taskDto = taskService.getTask(taskId);
        if (taskDto != null) {
            String response = fileFeignClient.uploadFile(file);
            if (response.equals("File Uploaded Successfully!")) {
                AttachmentFileDto attachmentFile = AttachmentFileDto
                        .builder()
                        .task(taskDto)
                        .path(file.getOriginalFilename())
                        .build();
                return attachmentMapper.toDto(attachmentFileRepository.save(attachmentMapper.toEntity(attachmentFile)));
            }
        }
        return null;
    }

    @Override
    public ResponseEntity<ByteArrayResource> downloadFile(Long attachmentId, Long taskId) {
        AttachmentFileDto attachmentFile = attachmentMapper.toDto(attachmentFileRepository.findById(attachmentId).orElse(null));
        if (attachmentFile != null && attachmentFile.getTask().getId().equals(taskId)) {
            return fileFeignClient.downloadFile(attachmentFile.getPath());
        }
        return null;
    }
}
