package com.example.wbdvsp20astefanifinalprojectserver.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Assignment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer eventId;
  private String name;
  private String description;
  private Integer userAssigned;
  private String assigneeComments;

  public Assignment(Integer id, Integer eventId, String name, String description, Integer userAssigned,
      String assigneeComments) {
    this.id = id;
    this.eventId = eventId;
    this.name = name;
    this.description = description;
    this.userAssigned = userAssigned;
    this.assigneeComments = assigneeComments;
  }

  public Assignment(Integer id, Integer eventId) {
    this.id = id;
    this.eventId = eventId;
  }

  public Assignment(String name, String description, Integer userAssigned,
      String assigneeComments) {
    this.name = name;
    this.description = description;
    this.userAssigned = userAssigned;
    this.assigneeComments = assigneeComments;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getUserAssigned() {
    return userAssigned;
  }

  public void setUserAssigned(Integer userAssigned) {
    this.userAssigned = userAssigned;
  }

  public String getAssigneeComments() {
    return assigneeComments;
  }

  public void setAssigneeComments(String assigneeComments) {
    this.assigneeComments = assigneeComments;
  }
}
