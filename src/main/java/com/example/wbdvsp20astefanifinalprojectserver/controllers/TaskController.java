package com.example.wbdvsp20astefanifinalprojectserver.controllers;

import com.example.wbdvsp20astefanifinalprojectserver.models.Task;
import com.example.wbdvsp20astefanifinalprojectserver.services.TaskService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

  @RestController
  @CrossOrigin(origins = "*", allowCredentials = "true")
  public class TaskController {


    @Autowired
    TaskService service;

    // CREATE Task for an event
    @PostMapping("/api/events/{eventId}/tasks")
    public Task createTask(@PathVariable("eventId") Integer eventId, @RequestBody Task task) {
      return service.createTask(eventId, task);
    }

    // READ An task by ID
    @GetMapping("/api/tasks/{taskId}")
    public Task findTaskById(@PathVariable("taskId") Integer taskId) {
      return service.findTaskById(taskId);
    }

    // READ All tasks for event
    @GetMapping("/api/events/{eventId}/tasks")
    public List<Task> findAllTasksForEvent(@PathVariable("eventId") Integer eventId) {
      return service.findAllTasksForEvent(eventId);
    }

    // UPDATE An task
    @PutMapping("/api/tasks/{taskId}")
    public int updateTask(@PathVariable("taskId") Integer taskId, @RequestBody Task task) {
      return service.updateTask(taskId, task);
    }

    // DELETE An event
    @DeleteMapping("/api/tasks/{taskId}")
    public int deleteTask(@PathVariable("taskId") Integer taskId) {
      return service.deleteTask(taskId);
    }

    // READ Tasks by assignee userId
   @GetMapping("/api/users/{userId}/tasks")
   public List<Task> findTaskByAssigneeId(@PathVariable("userId") Integer userId) {
     return service.findTaskByAssigneeId(userId);
   }

  }
