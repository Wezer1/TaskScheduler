package net.proselyte.pet_project_task_scheduler.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.proselyte.pet_project_task_scheduler.dto.TaskSchedulerDTO;
import net.proselyte.pet_project_task_scheduler.exception.NoSuchException;
import net.proselyte.pet_project_task_scheduler.mapper.TaskSchedulerMapper;
import net.proselyte.pet_project_task_scheduler.repository.TaskSchedulerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class TaskSchedulerService {
    private final TaskSchedulerRepository taskSchedulerRepository;
    private final TaskSchedulerMapper taskSchedulerMapper;


    public List<TaskSchedulerDTO> getAllTasksScheduler() {
        log.info("Get all Orders");
        if (taskSchedulerRepository.findAll().isEmpty()) {
            throw new NoSuchException("No orders");
        }
        return taskSchedulerRepository.findAll().stream().map(taskSchedulerMapper::toDto).collect(Collectors.toList());
    }

    public TaskSchedulerDTO saveTaskScheduler(TaskSchedulerDTO taskSchedulerDTO) {
        net.proselyte.pet_project_task_scheduler.entity.TaskScheduler savedTaskScheduler =
                taskSchedulerRepository.save(taskSchedulerMapper.toEntity(taskSchedulerDTO));
        return taskSchedulerMapper.toDto(savedTaskScheduler);
    }

    public TaskSchedulerDTO getTaskScheduler(Integer tasksSchedulerId) {
        log.info("Get taskScheduler by id: {} ", tasksSchedulerId);
        Optional<net.proselyte.pet_project_task_scheduler.entity.TaskScheduler> taskScheduler =
                Optional.ofNullable(taskSchedulerRepository.findById(tasksSchedulerId).orElseThrow(() ->
                        new NoSuchException("There is no tasksScheduler with ID = " + tasksSchedulerId + " in Database")));
        return taskSchedulerMapper.toDto(taskScheduler.get());
    }


}
