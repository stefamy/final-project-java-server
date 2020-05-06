package com.example.wbdvsp20astefanifinalprojectserver.models;

import java.util.List;

public class UserData {

  private Integer id;
  private User profile;
  private List<Task> tasks;
  private List<InviteEvent> invites;
  private List<Event> events;
  private List<Review> reviews;

  public UserData(User user, List<Task> tasks, List<InviteEvent> invites, List<Event> events,
      List<Review> reviews) {
    this.id = user.getId();
    this.profile = user;
    this.tasks = tasks;
    this.invites = invites;
    this.events = events;
    this.reviews = reviews;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public User getProfile() {
    return profile;
  }

  public void setProfile(User profile) {
    this.profile = profile;
  }

  public List<Task> getTasks() {
    return tasks;
  }

  public void setTasks(
      List<Task> tasks) {
    this.tasks = tasks;
  }

  public List<InviteEvent> getInvites() {
    return invites;
  }

  public void setInvites(List<InviteEvent> invites) {
    this.invites = invites;
  }

  public List<Event> getEvents() {
    return events;
  }

  public void setEvents(List<Event> events) {
    this.events = events;
  }

  public List<Review> getReviews() {
    return reviews;
  }

  public void setReviews(
      List<Review> reviews) {
    this.reviews = reviews;
  }

}

