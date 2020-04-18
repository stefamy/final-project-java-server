package com.example.wbdvsp20astefanifinalprojectserver.models;


import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Event {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer hostId;
  private String name;
  private String description;
  private Date date;
  private String foodType;
  private String groupType;
  private String specialOccasion;
  private String dressType;
  private String locationName;
  private String locationStreet1;
  private String locationStreet2;
  private String locationCity;
  private String locationState;
  private String locationZip;
  private String locationNotes;


  public Event(Integer id, Integer hostId, String name, String description, Date date, String foodType,
      String groupType, String specialOccasion, String dressType, String locationName,
      String locationStreet1, String locationStreet2, String locationCity,
      String locationState, String locationZip, String locationNotes) {
    this.id = id;
    this.hostId = hostId;
    this.name = name;
    this.description = description;
    this.date = date;
    this.foodType = foodType;
    this.groupType = groupType;
    this.specialOccasion = specialOccasion;
    this.dressType = dressType;
    this.locationName = locationName;
    this.locationStreet1 = locationStreet1;
    this.locationStreet2 = locationStreet2;
    this.locationCity = locationCity;
    this.locationState = locationState;
    this.locationZip = locationZip;
    this.locationNotes = locationNotes;
  }
  public Event(Integer id) {
    this.id = id;
  }

  public Event(Integer hostId, String name, String description, Date date, String foodType,
      String groupType, String specialOccasion, String dressType, String locationName,
      String locationStreet1, String locationStreet2, String locationCity,
      String locationState, String locationZip, String locationNotes) {
    this.hostId = hostId;
    this.name = name;
    this.description = description;
    this.date = date;
    this.foodType = foodType;
    this.groupType = groupType;
    this.specialOccasion = specialOccasion;
    this.dressType = dressType;
    this.locationName = locationName;
    this.locationStreet1 = locationStreet1;
    this.locationStreet2 = locationStreet2;
    this.locationCity = locationCity;
    this.locationState = locationState;
    this.locationZip = locationZip;
    this.locationNotes = locationNotes;
  }

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

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getFoodType() {
    return foodType;
  }

  public void setFoodType(String foodType) {
    this.foodType = foodType;
  }

  public String getGroupType() {
    return groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  public String getSpecialOccasion() {
    return specialOccasion;
  }

  public void setSpecialOccasion(String specialOccasion) {
    this.specialOccasion = specialOccasion;
  }

  public String getDressType() {
    return dressType;
  }

  public void setDressType(String dressType) {
    this.dressType = dressType;
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
}
