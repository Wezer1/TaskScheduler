package net.proselyte.pet_project_task_scheduler.mapper;

import net.proselyte.pet_project_task_scheduler.dto.TaskSchedulerDTO;
import net.proselyte.pet_project_task_scheduler.entity.TaskScheduler;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TaskSchedulerMapper {

    public abstract TaskScheduler toEntity(TaskSchedulerDTO taskSchedulerDTO);

    public abstract TaskSchedulerDTO toDto(TaskScheduler taskScheduler);
}
