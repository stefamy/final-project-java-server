package com.example.wbdvsp20astefanifinalprojectserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event")
public class Event {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer hostId;
  private String name;
  private String description;
  private String date;
  private String startTime;
  private String endTime;
  private String locationName;
  private String locationStreet1;
  private String locationStreet2;
  private String locationCity;
  private String locationState;
  private String locationZip;
  private String locationNotes;
  private String hostUsername;
  private String hostFirstName;
  private String hostLastName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getHostId() {
    return hostId;
  }

  public void setHostId(Integer hostId) {
    this.hostId = hostId;
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

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  public String getLocationStreet1() {
    return locationStreet1;
  }

  public void setLocationStreet1(String locationStreet1) {
    this.locationStreet1 = locationStreet1;
  }

  public String getLocationStreet2() {
    return locationStreet2;
  }

  public void setLocationStreet2(String locationStreet2) {
    this.locationStreet2 = locationStreet2;
  }

  public String getLocationCity() {
    return locationCity;
  }

  public void setLocationCity(String locationCity) {
    this.locationCity = locationCity;
  }

  public String getLocationState() {
    return locationState;
  }

  public void setLocationState(String locationState) {
    this.locationState = locationState;
  }

  public String getLocationZip() {
    return locationZip;
  }

  public void setLocationZip(String locationZip) {
    this.locationZip = locationZip;
  }

  public String getLocationNotes() {
    return locationNotes;
  }

  public void setLocationNotes(String locationNotes) {
    this.locationNotes = locationNotes;
  }

  public String getHostUsername() {
    return hostUsername;
  }

  public void setHostUsername(String hostUsername) {
    this.hostUsername = hostUsername;
  }

  public String getHostFirstName() {
    return hostFirstName;
  }

  public void setHostFirstName(String hostFirstName) {
    this.hostFirstName = hostFirstName;
  }

  public String getHostLastName() {
    return hostLastName;
  }

  public void setHostLastName(String hostLastName) {
    this.hostLastName = hostLastName;
  }
}
