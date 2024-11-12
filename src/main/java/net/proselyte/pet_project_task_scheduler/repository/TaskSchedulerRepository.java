package net.proselyte.pet_project_task_scheduler.repository;

import net.proselyte.pet_project_task_scheduler.entity.TaskScheduler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskSchedulerRepository extends JpaRepository<TaskScheduler,Integer> {
}
