package com.example.wbdvsp20astefanifinalprojectserver.controllers;

import com.example.wbdvsp20astefanifinalprojectserver.models.Guest;
import com.example.wbdvsp20astefanifinalprojectserver.models.GuestList;
import com.example.wbdvsp20astefanifinalprojectserver.models.Invite;
import com.example.wbdvsp20astefanifinalprojectserver.models.Event;
import com.example.wbdvsp20astefanifinalprojectserver.models.User;
import com.example.wbdvsp20astefanifinalprojectserver.services.InviteService;
import com.example.wbdvsp20astefanifinalprojectserver.services.EventService;
import java.util.HashMap;
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
  public class InviteController {


    @Autowired
    InviteService service;

    // CREATE Invite for an event
    @PostMapping("/api/events/{eventId}/invites")
    public Guest createInvite(@PathVariable("eventId") Integer eventId, @RequestBody Invite invite) {
      return service.createInvite(eventId, invite);
    }

    // READ An invite by ID
    @GetMapping("/api/invites/{inviteId}")
    public Invite findInviteById(@PathVariable("inviteId") Integer inviteId) {
      return service.findInviteById(inviteId);
    }

    // READ All invites for event
    @GetMapping("/api/events/{eventId}/invites")
    public GuestList findAllInvitesForEvent(@PathVariable("eventId") Integer eventId) {
      return service.findAllInvitesForEvent(eventId);
    }

    // UPDATE An invite
    @PutMapping("/api/invites/{inviteId}")
    public int updateInvite(@PathVariable("inviteId") Integer inviteId, @RequestBody Invite invite) {
      return service.updateInvite(inviteId, invite);
    }

    // DELETE An event
    @DeleteMapping("/api/invites/{inviteId}")
    public int deleteInvite(@PathVariable("inviteId") Integer inviteId) {
      return service.deleteInvite(inviteId);
    }

   // READ Invite by invitee userId
   @GetMapping("/api/users/{userId}/invites")
   public List<Invite> findInvitesByGuestId(@PathVariable("userId") Integer userId) {
      return service.findInvitesByGuestId(userId);
   }


  }
