package net.proselyte.pet_project_task_scheduler.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskSchedulerDTO {
    private Integer id;

    @NotBlank
    String title;

    @NotNull
    String description;

    @NotNull
    Boolean Done;

    @NotNull
    Timestamp createDate;
}
