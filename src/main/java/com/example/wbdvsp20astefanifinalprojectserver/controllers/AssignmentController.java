package com.example.wbdvsp20astefanifinalprojectserver.controllers;

import com.example.wbdvsp20astefanifinalprojectserver.models.Assignment;
import com.example.wbdvsp20astefanifinalprojectserver.models.Event;
import com.example.wbdvsp20astefanifinalprojectserver.services.AssignmentService;
import com.example.wbdvsp20astefanifinalprojectserver.services.EventService;
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
  public class AssignmentController {


    @Autowired
    AssignmentService service;

    // CREATE Assignment for an event
    @PostMapping("/api/events/{eventId}/assignments")
    public Assignment createAssignment(@PathVariable("eventId") Integer eventId, @RequestBody Assignment assignment) {
      return service.createAssignment(eventId, assignment);
    }

    // READ An assignment by ID
    @GetMapping("/api/assignments/{assignmentId}")
    public Assignment findAssignmentById(@PathVariable("assignmentId") Integer assignmentId) {
      return service.findAssignmentById(assignmentId);
    }

    // READ All assignments for event
    @GetMapping("/api/events/{eventId}/assignments")
    public List<Assignment> findAllAssignmentsForEvent(@PathVariable("eventId") Integer eventId) {
      return service.findAllAssignmentsForEvent(eventId);
    }

    // UPDATE An assignment
    @PutMapping("/api/assignments/{assignmentId}")
    public int updateAssignment(@PathVariable("assignmentId") Integer assignmentId, @RequestBody Assignment assignment) {
      return service.updateAssignment(assignmentId, assignment);
    }

    // DELETE An event
    @DeleteMapping("/api/assignments/{assignmentId}")
    public int deleteAssignment(@PathVariable("assignmentId") Integer assignmentId) {
      return service.deleteAssignment(assignmentId);
    }

  }
