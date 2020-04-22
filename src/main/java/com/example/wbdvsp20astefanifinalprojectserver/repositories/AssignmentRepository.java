package com.example.wbdvsp20astefanifinalprojectserver.repositories;

import com.example.wbdvsp20astefanifinalprojectserver.models.Assignment;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends CrudRepository<Assignment, Integer> {

    @Query(value = "SELECT * FROM Assignment assignment", nativeQuery = true)
    List<Assignment> findAllAssignments();


    @Query(value ="SELECT * FROM Assignment assignment WHERE event_id=:eventId", nativeQuery = true)
    public List<Assignment> findAllAssignmentsForEvent(@Param("eventId") Integer eventId);


    @Query(value = "SELECT * FROM Assignment assignment WHERE id=:id", nativeQuery = true)
    public Assignment findAssignmentById(@Param("id") Integer id);

    @Query(value = "SELECT * FROM Assignment assignment WHERE assignee_user_id=:userId", nativeQuery = true)
    public List<Assignment> findAssignmentByAssigneeId(@Param("userId") Integer userId);

  }


