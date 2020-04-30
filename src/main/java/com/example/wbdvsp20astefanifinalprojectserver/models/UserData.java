package com.example.wbdvsp20astefanifinalprojectserver.models;

import java.util.List;

public class UserData {

  private User profile;
  private List<Task> tasks;
  private List<RSVP> rsvps;
  private List<Event> events;
  private List<Review> reviews;

  public UserData(User user, List<Task> tasks, List<RSVP> rsvps, List<Event> events,
      List<Review> reviews) {
    this.profile = user;
    this.tasks = tasks;
    this.rsvps = rsvps;
    this.events = events;
    this.reviews = reviews;
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

  public List<RSVP> getRsvps() {
    return rsvps;
  }

  public void setRsvps(List<RSVP> rsvps) {
    this.rsvps = rsvps;
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

