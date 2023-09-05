package kz.middle.middle01liquibase.repository;

import jakarta.transaction.Transactional;
import kz.middle.middle01liquibase.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {



}