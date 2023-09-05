package kz.middle.middle01liquibase.service;

import kz.middle.middle01liquibase.dto.TaskDto;

import java.util.List;

public interface TaskService {

    List<TaskDto> getTasks();
    TaskDto getTask(Long id);
    TaskDto addTask(TaskDto task);
    TaskDto updateTask(TaskDto task);
    void deleteTask(Long id);

}
