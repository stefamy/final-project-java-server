package com.example.wbdvsp20astefanifinalprojectserver.models;

import java.util.List;

public class GuestList {

  private List<User> users;
  private List<Invite> invites;

  public GuestList(List<User> users, List<Invite> invites) {
    this.users = users;
    this.invites = invites;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

  public List<Invite> getInvites() {
    return invites;
  }

  public void setInvites(
      List<Invite> invites) {
    this.invites = invites;
  }

}
