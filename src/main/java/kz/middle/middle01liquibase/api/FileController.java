package kz.middle.middle01liquibase.api;

import kz.middle.middle01liquibase.dto.AttachmentFileDto;
import kz.middle.middle01liquibase.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/file")
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    @PostMapping(value = "/upload")
    public AttachmentFileDto upload(@RequestPart("file") MultipartFile file,
                                    @RequestParam("taskId") Long taskId){
        return fileService.uploadFile(taskId, file);
    }

    @GetMapping(value = "/download/{taskId}/{attachmentId}")
    public ResponseEntity<ByteArrayResource> downloadFile(
            @PathVariable(name = "taskId") Long taskId,
            @PathVariable(name = "attachmentId") Long attachmentId){
        return fileService.downloadFile(attachmentId, taskId);
    }
}
