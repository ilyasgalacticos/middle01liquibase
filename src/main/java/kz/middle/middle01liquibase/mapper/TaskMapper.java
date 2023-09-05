package kz.middle.middle01liquibase.mapper;

import kz.middle.middle01liquibase.dto.TaskDto;
import kz.middle.middle01liquibase.model.Task;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);
    Task toEntity(TaskDto taskDto);

    List<TaskDto> toDtoList(List<Task> tasks);

}
