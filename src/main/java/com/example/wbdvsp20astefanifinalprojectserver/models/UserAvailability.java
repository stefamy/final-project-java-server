package com.example.wbdvsp20astefanifinalprojectserver.models;

public class UserAvailability {

  private Boolean email;
  private Boolean username;

  public UserAvailability(Boolean email, Boolean username) {
    this.email = email;
    this.username = username;
  }

  public Boolean getEmail() {
    return email;
  }

  public void setEmail(Boolean email) {
    this.email = email;
  }

  public Boolean getUsername() {
    return username;
  }

  public void setUsername(Boolean username) {
    this.username = username;
  }
}
