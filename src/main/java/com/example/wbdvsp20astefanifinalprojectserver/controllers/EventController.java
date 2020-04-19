package com.example.wbdvsp20astefanifinalprojectserver.controllers;

import com.example.wbdvsp20astefanifinalprojectserver.models.Event;
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
public class EventController {


  @Autowired
  EventService service;

  	// CREATE Event for user
    @PostMapping("/api/events/{userId}")
    public Event createEvent(@PathVariable("userId") Integer userId, @RequestBody Event event) {
        return service.createEvent(userId, event);
    }

    // READ An event by ID
    @GetMapping("/api/events/{eventId}")
    public Event findEventById(@PathVariable("eventId") Integer eventId) {
        return service.findEventById(eventId);
    }

    // READ All events for host
    @GetMapping("/api/events/host/{hostId}")
    public List<Event> findEventsByHost(@PathVariable("hostId") Integer hostId) {
        return service.findEventsByHost(hostId);
    }

    // UPDATE An event
    @PutMapping("/api/events/{eventId}")
    public int updateEvent(@PathVariable("eventId") Integer eventId, @RequestBody Event event) {
        return service.updateEvent(eventId, event);
    }

    // DELETE An event
    @DeleteMapping("/api/events/{eventId}")
    public int deleteEvent(@PathVariable("eventId") Integer eventId) {
        return service.deleteEvent(eventId);
    }

}

//        java -jar target/*.jar
