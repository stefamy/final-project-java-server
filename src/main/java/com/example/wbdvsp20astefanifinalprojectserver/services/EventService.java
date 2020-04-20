package com.example.wbdvsp20astefanifinalprojectserver.services;

import com.example.wbdvsp20astefanifinalprojectserver.models.Event;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.EventRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

  @Autowired
  EventRepository repository;

  public Event createEvent(Integer userId, Event event) {
    event.setHostId(userId);
    return repository.save(event);
  }

  public Event findEventById(Integer eventId) {
    return repository.findByEventById(eventId);
  }

  public List<Event> findEventsByHost(Integer hostId) {
    return repository.findEventsByHost(hostId);
  }

  public int updateEvent(Integer eventId, Event event) {
    repository.save(event);
    return 1;
  }

  public int deleteEvent(Integer eventId) {
    repository.deleteById(eventId);
    return 1;
  }

}
