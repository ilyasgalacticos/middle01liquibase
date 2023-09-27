package kz.middle.middle01liquibase.service;

import kz.middle.middle01liquibase.dto.AttachmentFileDto;
import kz.middle.middle01liquibase.dto.TaskDto;
import kz.middle.middle01liquibase.feign.FileFeignClient;
import kz.middle.middle01liquibase.model.AttachmentFile;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    AttachmentFileDto uploadFile(Long taskId, MultipartFile file);
    ResponseEntity<ByteArrayResource> downloadFile(Long attachmentId, Long taskId);

}
