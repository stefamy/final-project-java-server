package com.example.wbdvsp20astefanifinalprojectserver.models;

public class InviteEvent {

  private Invite invite;
  private Event event;

  public InviteEvent(Invite invite, Event event) {
    this.invite = invite;
    this.event = event;
  }

  public InviteEvent() { }

  public Invite getInvite() {
    return invite;
  }

  public void setInvite(Invite invite) {
    this.invite = invite;
  }

  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

}
