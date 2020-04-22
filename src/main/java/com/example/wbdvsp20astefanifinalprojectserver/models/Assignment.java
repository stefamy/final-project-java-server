package com.example.wbdvsp20astefanifinalprojectserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assignment")
public class Assignment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer eventId;
  private String title;
  private String description;
  private String status;
  private String assigneeFirstName;
  private String assigneeLastName;
  private String assigneeEmail;
  private String assigneeComments;
  private Integer assigneeUserId;
  private String dateOfRequest;
  private String dateOfResponse;
  private String type;

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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getAssigneeFirstName() {
    return assigneeFirstName;
  }

  public void setAssigneeFirstName(String assigneeFirstName) {
    this.assigneeFirstName = assigneeFirstName;
  }

  public String getAssigneeLastName() {
    return assigneeLastName;
  }

  public void setAssigneeLastName(String assigneeLastName) {
    this.assigneeLastName = assigneeLastName;
  }

  public String getAssigneeEmail() {
    return assigneeEmail;
  }

  public void setAssigneeEmail(String assigneeEmail) {
    this.assigneeEmail = assigneeEmail;
  }

  public String getAssigneeComments() {
    return assigneeComments;
  }

  public void setAssigneeComments(String assigneeComments) {
    this.assigneeComments = assigneeComments;
  }

  public Integer getAssigneeUserId() {
    return assigneeUserId;
  }

  public void setAssigneeUserId(Integer assigneeUserId) {
    this.assigneeUserId = assigneeUserId;
  }

  public String getDateOfRequest() {
    return dateOfRequest;
  }

  public void setDateOfRequest(String dateOfRequest) {
    this.dateOfRequest = dateOfRequest;
  }

  public String getDateOfResponse() {
    return dateOfResponse;
  }

  public void setDateOfResponse(String dateOfResponse) {
    this.dateOfResponse = dateOfResponse;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
