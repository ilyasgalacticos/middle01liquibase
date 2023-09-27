package kz.middle.middle01liquibase.mapper;

import kz.middle.middle01liquibase.dto.AttachmentFileDto;
import kz.middle.middle01liquibase.model.AttachmentFile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AttachmentMapper {

    AttachmentFileDto toDto(AttachmentFile file);
    AttachmentFile toEntity(AttachmentFileDto attachmentDto);
    List<AttachmentFileDto> toDtoList(List<AttachmentFile> list);

}
