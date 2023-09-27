package kz.middle.middle01liquibase.repository;

import jakarta.transaction.Transactional;
import kz.middle.middle01liquibase.model.AttachmentFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface AttachmentFileRepository extends JpaRepository<AttachmentFile, Long> {
}
