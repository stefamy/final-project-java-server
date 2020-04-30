package com.example.wbdvsp20astefanifinalprojectserver.repositories;

import com.example.wbdvsp20astefanifinalprojectserver.models.Task;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

    @Query(value = "SELECT * FROM Task task", nativeQuery = true)
    List<Task> findAllTasks();


    @Query(value ="SELECT * FROM Task task WHERE event_id=:eventId", nativeQuery = true)
    public List<Task> findAllTasksForEvent(@Param("eventId") Integer eventId);


    @Query(value = "SELECT * FROM Task task WHERE id=:id", nativeQuery = true)
    public Task findTaskById(@Param("id") Integer id);

    @Query(value = "SELECT * FROM Task task WHERE assignee_user_id=:userId", nativeQuery = true)
    public List<Task> findTaskByAssigneeId(@Param("userId") Integer userId);

  }


