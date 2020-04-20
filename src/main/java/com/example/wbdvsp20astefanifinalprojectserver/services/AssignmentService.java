package com.example.wbdvsp20astefanifinalprojectserver.services;

import com.example.wbdvsp20astefanifinalprojectserver.models.Assignment;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.AssignmentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentService {

    @Autowired
    AssignmentRepository repository;

    public Assignment createAssignment(Integer eventId, Assignment assignment) {
      assignment.setEventId(eventId);
      return repository.save(assignment);
    }

    public Assignment findAssignmentById(Integer assignmentId) {
      return repository.findAssignmentById(assignmentId);
    }

    public List<Assignment> findAllAssignmentsForEvent(Integer eventId) {
      return repository.findAllAssignmentsForEvent(eventId);
    }

    public List<Assignment> findAssignmentByAssigneeId(Integer userId) {
      return repository.findAssignmentByAssigneeId(userId);
    }

    public int updateAssignment(Integer assignmentId, Assignment assignment) {
      repository.save(assignment);
      return 1;
    }

    public int deleteAssignment(Integer assignmentId) {
      repository.deleteById(assignmentId);
      return 1;
    }



  }
