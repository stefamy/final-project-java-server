package com.example.wbdvsp20astefanifinalprojectserver.services;

import com.example.wbdvsp20astefanifinalprojectserver.models.Guest;
import com.example.wbdvsp20astefanifinalprojectserver.models.GuestList;
import com.example.wbdvsp20astefanifinalprojectserver.models.Invite;
import com.example.wbdvsp20astefanifinalprojectserver.models.User;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.InviteRepository;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.UserRepository;
import java.util.ArrayList;
import java.util.Date;
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


    public Guest createInvite(Integer eventId, Invite invite) {
      invite.setEventId(eventId);
      User user = userService.findUserByEmailAddress(invite.getEmail());
      if (user == null) {
        user = new User();
        user.setFirstName(invite.getFirstName());
        user.setLastName(invite.getLastName());
        user.setEmail(invite.getEmail());
        user.setUsername(invite.getEmail());
        user.setAccountClaimed(0);
        userService.createNewUser(user);
      }
      invite.setGuestId(user.getId());
      repository.save(invite);
      return new Guest(user, invite);
    }

    public Invite findInviteById(Integer inviteId) {
      return repository.findInviteById(inviteId);
    }

    public GuestList findAllInvitesForEvent(Integer eventId) {
      List<Invite> invites = repository.findAllInvitesForEvent(eventId);
      List<User> users = new ArrayList<>();
      for (int i = 0; i < invites.size(); i++) {
          User user = userService.findUserByUserId(String.valueOf(invites.get(i).getGuestId()));
          users.add(user.cloaked());
      }
      return new GuestList(users, invites);
    }

    public List<Invite> findInvitesByGuestId(Integer userId) {
      return repository.findInvitesByGuestId(userId);
    }

    public int updateInvite(Integer inviteId, Invite invite) {
      repository.save(invite);
      return 1;
    }

    public int deleteInvite(Integer inviteId) {
      repository.deleteById(inviteId);
      return 1;
    }


    public Invite createFirstInvite(Integer userId, Integer eventId) {
      User eventHost = userRepository.findUserByUserId(String.valueOf(userId));
      Invite invite = new Invite();
      invite.setGuestId(userId);
      invite.setEventId(eventId);
      invite.setFirstName(eventHost.getFirstName());
      invite.setLastName(eventHost.getLastName());
      invite.setEmail(eventHost.getEmail());
      invite.setResponse("Yes");
      return repository.save(invite);
    }

  }
