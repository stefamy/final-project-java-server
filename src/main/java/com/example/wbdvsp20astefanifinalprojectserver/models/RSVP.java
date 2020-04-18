package com.example.wbdvsp20astefanifinalprojectserver.models;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RSVP {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer eventId;
  private Integer guestId;
  private String response;
  private Date invitationDate;
  private Date responseDate;

  public RSVP(Integer id, Integer eventId, Integer guestId, String response, Date invitationDate,
      Date responseDate) {
    this.id = id;
    this.eventId = eventId;
    this.guestId = guestId;
    this.response = response;
    this.invitationDate = invitationDate;
    this.responseDate = responseDate;
  }

  public RSVP(Integer eventId, Integer guestId, String response, Date invitationDate,
      Date responseDate) {
    this.eventId = eventId;
    this.guestId = guestId;
    this.response = response;
    this.invitationDate = invitationDate;
    this.responseDate = responseDate;
  }

  public RSVP(Integer id) {
    this.id = id;
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

  public Integer getGuestId() {
    return guestId;
  }

  public void setGuestId(Integer guestId) {
    this.guestId = guestId;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public Date getInvitationDate() {
    return invitationDate;
  }

  public void setInvitationDate(Date invitationDate) {
    this.invitationDate = invitationDate;
  }

  public Date getResponseDate() {
    return responseDate;
  }

  public void setResponseDate(Date responseDate) {
    this.responseDate = responseDate;
  }
}
