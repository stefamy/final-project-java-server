package com.example.wbdvsp20astefanifinalprojectserver.models;

import java.util.List;


public class EventData {

  private Integer id;
  private Event logistics;
  private List<Task> tasks;
  private List<Guest> guestList;

  public EventData(Event event, List<Task> tasks, List<Guest> guestList) {
    this.id = event.getId();
    this.logistics = event;
    this.tasks = tasks;
    this.guestList = guestList;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Event getLogistics() {
    return logistics;
  }

  public void setLogistics(Event logistics) {
    this.logistics = logistics;
  }

  public List<Task> getTasks() {
    return tasks;
  }

  public void setTasks(List<Task> tasks) {
    this.tasks = tasks;
  }

  public List<Guest> getGuestList() {
    return guestList;
  }

  public void setGestList(
      List<Guest> guestList) {
    this.guestList = guestList;
  }
}



