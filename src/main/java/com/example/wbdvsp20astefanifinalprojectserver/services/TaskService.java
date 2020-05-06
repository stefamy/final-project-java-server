package com.example.wbdvsp20astefanifinalprojectserver.services;

import com.example.wbdvsp20astefanifinalprojectserver.models.Task;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.TaskRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    TaskRepository repository;

    public Task createTask(Integer eventId, Task task) {
      task.setEventId(eventId);
      return repository.save(task);
    }

    public Task findTaskById(Integer taskId) {
      return repository.findTaskById(taskId);
    }

    public List<Task> findAllTasksForEvent(Integer eventId) {
      return repository.findAllTasksForEvent(eventId);
    }

    public List<Task> findTaskByAssigneeId(Integer userId) {
      return repository.findTaskByAssigneeId(userId);
    }

    public int updateTask(Integer taskId, Task task) {
      repository.save(task);
      return 1;
    }

    public int deleteTask(Integer taskId) {
      repository.deleteById(taskId);
      return 1;
    }

     public int createSampleTask(Integer eventId) {
      Task sampleTask = new Task();
      sampleTask.setEventId(eventId);
      sampleTask.setTitle("Create Task List.");
      sampleTask.setDescription("This is only a sample task. Delete or edit this one and make some of your own!");
      sampleTask.setStatus("Pending");
      sampleTask.setType("Event Prep");
      repository.save(sampleTask);
      return 1;
     }



}
