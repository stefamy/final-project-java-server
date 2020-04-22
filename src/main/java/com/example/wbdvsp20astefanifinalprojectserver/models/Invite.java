package com.example.wbdvsp20astefanifinalprojectserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invite")
public class Invite {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer eventId;
  private Integer guestId;
  private String firstName;
  private String lastName;
  private String email;
  private String response;
  private String comments;
  private String invitationDate;
  private String responseDate;

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

  public Integer getGuestId() {
    return guestId;
  }

  public void setGuestId(Integer guestId) {
    this.guestId = guestId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public String getInvitationDate() {
    return invitationDate;
  }

  public void setInvitationDate(String invitationDate) {
    this.invitationDate = invitationDate;
  }

  public String getResponseDate() {
    return responseDate;
  }

  public void setResponseDate(String responseDate) {
    this.responseDate = responseDate;
  }


}
