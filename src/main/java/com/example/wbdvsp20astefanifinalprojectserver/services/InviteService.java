package com.example.wbdvsp20astefanifinalprojectserver.services;

import com.example.wbdvsp20astefanifinalprojectserver.models.GuestList;
import com.example.wbdvsp20astefanifinalprojectserver.models.Invite;
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

    public Invite createInvite(Integer eventId, Invite invite) {
      invite.setEventId(eventId);
      User user = userRepository.findUserByEmailAddress(invite.getEmail());
      if (user != null) {
        user = new User();
        user.setFirstName(invite.getFirstName());
        user.setLastName(invite.getLastName());
        user.setEmail(invite.getEmail());
        userRepository.save(user);
      }
      invite.setGuestId(user.getId());
      return repository.save(invite);
    }

    public Invite findInviteById(Integer inviteId) {
      return repository.findInviteById(inviteId);
    }

    public GuestList findAllInvitesForEvent(Integer eventId) {
      List<Invite> invites = repository.findAllInvitesForEvent(eventId);
      List<User> users = new ArrayList<>();
      for (int i = 0; i < invites.size(); i++) {
          User user = userService.findUserByUserId(String.valueOf(invites.get(i).getGuestId()));
          users.add(user);
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



  }
