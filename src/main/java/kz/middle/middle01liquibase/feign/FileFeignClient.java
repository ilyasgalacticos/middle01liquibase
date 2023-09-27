package kz.middle.middle01liquibase.feign;

import kz.middle.middle01liquibase.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "file-feign-client", url = "${file.feign.client.url}", configuration = FeignConfig.class)
public interface FileFeignClient {

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String uploadFile(@RequestPart("file") MultipartFile file);

    @GetMapping(value = "/download/{fileName}")
    ResponseEntity<ByteArrayResource> downloadFile(@PathVariable(name = "fileName") String fileName);

}
