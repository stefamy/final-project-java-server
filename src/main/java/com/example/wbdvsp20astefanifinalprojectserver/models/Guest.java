package com.example.wbdvsp20astefanifinalprojectserver.models;


public class Guest {

  private User user;
  private Invite invite;

  public Guest(User user, Invite invite) {
    this.user = user;
    this.invite = invite;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Invite getInvite() {
    return invite;
  }

  public void setInvite(Invite invite) {
    this.invite = invite;
  }
}
