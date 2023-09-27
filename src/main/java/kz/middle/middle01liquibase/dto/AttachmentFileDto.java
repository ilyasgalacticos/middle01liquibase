package kz.middle.middle01liquibase.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class AttachmentFileDto {

    private Long id;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;
    private String path;
    private TaskDto task;

}
