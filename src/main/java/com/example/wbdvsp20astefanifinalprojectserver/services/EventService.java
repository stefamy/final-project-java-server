package com.example.wbdvsp20astefanifinalprojectserver.services;

import com.example.wbdvsp20astefanifinalprojectserver.models.Assignment;
import com.example.wbdvsp20astefanifinalprojectserver.models.Event;
import com.example.wbdvsp20astefanifinalprojectserver.models.GuestList;
import com.example.wbdvsp20astefanifinalprojectserver.models.Invite;
import com.example.wbdvsp20astefanifinalprojectserver.models.User;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.AssignmentRepository;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.EventRepository;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.InviteRepository;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.UserRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

  @Autowired
  EventRepository repository;

  @Autowired
  InviteRepository inviteRepository;

  @Autowired
  InviteService inviteService;

  @Autowired
  AssignmentService assignmentService;

  @Autowired
  AssignmentRepository assignmentRepository;

  @Autowired
  UserRepository userRepository;



  public Event createEvent(Integer userId, Event event) {
    User user = userRepository.findUserByUserId(String.valueOf(userId));
    event.setHostId(userId);
    event.setHostFirstName(user.getFirstName());
    event.setHostLastName(user.getLastName());
    event.setHostUsername(user.getUsername());
    Event newEvent = repository.save(event);
    inviteService.createFirstInvite(userId, newEvent.getId());
    assignmentService.createSampleAssignment(newEvent.getId());
    return newEvent;
  }

  public Event findEventById(Integer eventId) {
    return repository.findByEventById(eventId);
  }

  public List<Event> findEventsByHost(Integer hostId) {
    return repository.findEventsByHost(hostId);
  }

  public List<Event> findEventsByGuest(Integer guestId) {
    List<Invite> invites = inviteRepository.findInvitesByGuestId(guestId);
    List<Event> events = new ArrayList<Event>();
    for (int i = 0; i < invites.size(); i++) {
      Event event = repository.findByEventById(invites.get(i).getEventId());
      events.add(event);
    }
    return events;
  }
  public int updateEvent(Integer eventId, Event event) {
    repository.save(event);
    return 1;
  }

  public int deleteEvent(Integer eventId) {
    List<Assignment> assignments = assignmentRepository.findAllAssignmentsForEvent(eventId);
    List<Invite> invites = inviteRepository.findAllInvitesForEvent(eventId);

    for (int i = 0; i < assignments.size(); i++) {
      assignmentRepository.deleteById(assignments.get(i).getId());
    }
    for (int i = 0; i < invites.size(); i++) {
      inviteRepository.deleteById(invites.get(i).getId());
    }
    repository.deleteById(eventId);
    return 1;
  }

}
