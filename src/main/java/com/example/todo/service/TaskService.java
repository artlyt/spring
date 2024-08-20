package com.example.todo.service;

import com.example.todo.model.Task;
import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(long id);
    Task createTask(Task task);
    Task updateTask(long id, Task task);
    void deleteTask(long id);
}
