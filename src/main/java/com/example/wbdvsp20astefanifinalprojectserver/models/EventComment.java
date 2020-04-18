package com.example.wbdvsp20astefanifinalprojectserver.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EventComment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer eventId;
  private Integer commenterId;
  private String comment;

  public EventComment(Integer id, Integer eventId, Integer commenterId, String comment) {
    this.id = id;
    this.eventId = eventId;
    this.commenterId = commenterId;
    this.comment = comment;
  }

  public EventComment(Integer id) {
    this.id = id;
  }

  public EventComment(Integer eventId, Integer commenterId, String comment) {
    this.eventId = eventId;
    this.commenterId = commenterId;
    this.comment = comment;
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

  public Integer getCommenterId() {
    return commenterId;
  }

  public void setCommenterId(Integer commenterId) {
    this.commenterId = commenterId;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}
