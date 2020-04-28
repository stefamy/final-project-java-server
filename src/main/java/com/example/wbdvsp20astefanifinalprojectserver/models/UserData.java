package com.example.wbdvsp20astefanifinalprojectserver.models;

import java.util.List;

public class UserData {

  private User profile;
  private List<Assignment> assignments;
  private List<RSVP> rsvps;
  private List<Event> events;
  private List<Review> reviews;

  public UserData(User user, List<Assignment> assignments, List<RSVP> rsvps, List<Event> events,
      List<Review> reviews) {
    this.profile = user;
    this.assignments = assignments;
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

  public List<Assignment> getAssignments() {
    return assignments;
  }

  public void setAssignments(
      List<Assignment> assignments) {
    this.assignments = assignments;
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

