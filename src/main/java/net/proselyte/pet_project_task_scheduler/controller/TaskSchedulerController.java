package net.proselyte.pet_project_task_scheduler.controller;


import lombok.RequiredArgsConstructor;
import net.proselyte.pet_project_task_scheduler.dto.TaskSchedulerDTO;
import net.proselyte.pet_project_task_scheduler.service.TaskSchedulerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<TaskSchedulerDTO>> getTasksScheduler(){
        return ResponseEntity.ok(taskSchedulerService.getAllTasksScheduler());
    }

    @GetMapping("/{tasksSchedulerId}")
    public ResponseEntity<TaskSchedulerDTO> getTaskScheduler(@PathVariable Integer tasksSchedulerId){
        return  ResponseEntity.ok(taskSchedulerService.getTaskScheduler(tasksSchedulerId));
    }

    @PostMapping("/")
    public ResponseEntity<TaskSchedulerDTO> addTaskSchedulerDTO(@RequestBody TaskSchedulerDTO taskSchedulerDTO){
        return ResponseEntity.ok(taskSchedulerService.saveTaskScheduler(taskSchedulerDTO));
    }

}
