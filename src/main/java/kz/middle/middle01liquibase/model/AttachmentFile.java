package kz.middle.middle01liquibase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "attachment_files")
@Getter
@Setter
public class AttachmentFile extends BaseEntity{

    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    private Task task;

}
