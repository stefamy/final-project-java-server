package com.example.wbdvsp20astefanifinalprojectserver.models;

public class Guest {

  private Integer id;
  private String privacySettings;

  public Guest(Integer id, String privacySettings) {
    this.id = id;
    this.privacySettings = privacySettings;
  }

  public Guest(String privacySettings) {
    this.privacySettings = privacySettings;
  }

  public Guest(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPrivacySettings() {
    return privacySettings;
  }

  public void setPrivacySettings(String privacySettings) {
    this.privacySettings = privacySettings;
  }
}
