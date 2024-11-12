package net.proselyte.pet_project_task_scheduler.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "task_cheduler")
@Data
public class TaskScheduler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title", length = 64)
    private String title;

    @Column(name = "description", length = 64)
    private String description;

    @Column(name = "Done")
    private Boolean Done;

    @Column(name = "create_date")
    private Timestamp createDate;

}
