package com.example.wbdvsp20astefanifinalprojectserver.services;

import com.example.wbdvsp20astefanifinalprojectserver.models.Event;
import com.example.wbdvsp20astefanifinalprojectserver.models.Guest;
import com.example.wbdvsp20astefanifinalprojectserver.models.Invite;
import com.example.wbdvsp20astefanifinalprojectserver.models.InviteEvent;
import com.example.wbdvsp20astefanifinalprojectserver.models.User;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.InviteRepository;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InviteService {

    @Autowired
    InviteRepository repository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Autowired
    EventService eventService;

    public Guest createGuestInvite(Integer eventId, Guest guest) {
      guest.setEventId(eventId);
      User user = userRepository.findUserByEmailAddress(guest.getEmail());
      if (user == null) {
        // If no user exists, create a new (unclaimed) user:
        user = guest.createUser();
        user.setAccountClaimed(0);
        user = userRepository.save(user);
      }
      guest.setGuestId(user.getId());
      guest.setAccountClaimed(user.getAccountClaimed());
      Invite invite = repository.save(guest.createInvite());
      guest.setComments(invite.getComments());
      guest.setInviteId(invite.getId());
      return guest;
    }

    public Invite createHostInvite(Integer userId, Integer eventId) {
      User eventHost = userRepository.findUserByUserId(String.valueOf(userId));
      Invite invite = new Invite();
      invite.setGuestId(userId);
      invite.setEventId(eventId);
      invite.setResponse("Yes");
      return repository.save(invite);
    }

    public List<Guest> findAllInvitesForEvent(Integer eventId) {
      List<Guest> guests = new ArrayList<>();
      List<Invite> invites = repository.findAllInvitesForEvent(eventId);
      for (int i = 0; i < invites.size(); i++) {
        User user = userService.findUserByUserId(String.valueOf(invites.get(i).getGuestId()));
        Guest guest = new Guest(user, invites.get(i));
        guests.add(guest);
      }
      return guests;
    }

    public List<InviteEvent> findRSVPsByGuestId(Integer userId) {
      List<Invite> invites = repository.findInvitesByGuestId(userId);
      List<InviteEvent> inviteEvent = new ArrayList<>();
      for (int i = 0; i < invites.size(); i++) {
        Event event = eventService.findEventById(invites.get(i).getEventId());
        inviteEvent.add(new InviteEvent(invites.get(i), event));
      }
      return inviteEvent;
    }

    public List<Invite> findInvitesByGuestId(Integer guestId) {
      return repository.findInvitesByGuestId(guestId);
    }

    public List<Invite> findAcceptedInvitesByGuestId(Integer guestId) {
      return repository.findAcceptedInvitesByGuestId(guestId);
    }


    public Invite findInviteById(Integer inviteId) {
      return repository.findInviteById(inviteId);
    }

    public int updateInvite(Integer inviteId, Guest guest) {
      Invite invite = guest.createInvite();
      invite.setId(inviteId);

      if (guest.getAccountClaimed() == 0) {
        User user = guest.createUser();
        userRepository.save(user);
      }
      repository.save(invite);

      return 1;
    }

    public int deleteInvite(Integer inviteId) {
      Invite invite = repository.findInviteById(inviteId);
      User user = userRepository.findUserByUserId(String.valueOf(invite.getGuestId()));
      if (user.getAccountClaimed() == 0) {
        userRepository.deleteById(user.getId());
      }
      repository.deleteById(inviteId);
      return 1;
    }

  }
