package net.proselyte.pet_project_task_scheduler.controller;


import lombok.RequiredArgsConstructor;
import net.proselyte.pet_project_task_scheduler.dto.TaskSchedulerDTO;
import net.proselyte.pet_project_task_scheduler.service.TaskSchedulerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//получение всех задач
//получение одной задачи
//добавление задачи
//изменение задачи
//удаление задачи


@RestController
@RequestMapping("/api/tasksScheduler")//Указатель мапинга между HTTP-запросом и методами обработки контроллера
@RequiredArgsConstructor
public class TaskSchedulerController {

    private final TaskSchedulerService taskSchedulerService;

    @GetMapping("/")
    public ResponseEntity<List<TaskSchedulerDTO>> getTaskScheduler(){
        return ResponseEntity.ok(taskSchedulerService.getAllTasksScheduler());
    }



}
