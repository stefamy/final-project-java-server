package com.example.wbdvsp20astefanifinalprojectserver.services;

import com.example.wbdvsp20astefanifinalprojectserver.models.Invite;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.InviteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InviteService {

    @Autowired
    InviteRepository repository;

    public Invite createInvite(Integer eventId, Invite invite) {
      invite.setEventId(eventId);
      return repository.save(invite);
    }

    public Invite findInviteById(Integer inviteId) {
      return repository.findInviteById(inviteId);
    }

    public List<Invite> findAllInvitesForEvent(Integer eventId) {
      return repository.findAllInvitesForEvent(eventId);
    }

    public List<Invite> findInviteByGuestId(Integer userId) {
      return repository.findInviteByGuestId(userId);
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
