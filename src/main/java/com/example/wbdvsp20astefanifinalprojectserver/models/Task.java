package com.example.wbdvsp20astefanifinalprojectserver.models;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Date dueDate;

  public Task(Integer id, Date dueDate) {
    this.id = id;
    this.dueDate = dueDate;
  }

  public Task(Date dueDate) {
    this.dueDate = dueDate;
  }

  public Task(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }
}
