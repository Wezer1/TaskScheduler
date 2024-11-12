package net.proselyte.pet_project_task_scheduler.exception;

public class NoSuchException extends RuntimeException{
    public NoSuchException(String message) {
        super(message);
    }
}