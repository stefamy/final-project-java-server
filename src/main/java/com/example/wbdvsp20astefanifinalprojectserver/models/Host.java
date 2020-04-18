package com.example.wbdvsp20astefanifinalprojectserver.models;

public class Host {

  private Integer id;
  private String preferredContactMethod;
  private String reminderSettings;

  public Host(Integer id, String preferredContactMethod, String reminderSettings) {
    this.id = id;
    this.preferredContactMethod = preferredContactMethod;
    this.reminderSettings = reminderSettings;
  }

  public Host(Integer id) {
    this.id = id;
  }

  public Host(String preferredContactMethod, String reminderSettings) {
    this.preferredContactMethod = preferredContactMethod;
    this.reminderSettings = reminderSettings;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPreferredContactMethod() {
    return preferredContactMethod;
  }

  public void setPreferredContactMethod(String preferredContactMethod) {
    this.preferredContactMethod = preferredContactMethod;
  }

  public String getReminderSettings() {
    return reminderSettings;
  }

  public void setReminderSettings(String reminderSettings) {
    this.reminderSettings = reminderSettings;
  }
}
