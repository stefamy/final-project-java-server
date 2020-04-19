package com.example.wbdvsp20astefanifinalprojectserver.models;

public class ProtectedProfile extends PublicProfile {

  private String email;
  private String phone;
  private String city;
  private String state;

  private String otherDietaryRestrictions;
  private String specialRequests;

  public ProtectedProfile(User user) {
    super(user);
    this.email = user.getEmail();
    this.phone = user.getPhone();
    this.city = user.getCity();
    this.state = user.getState();
    this.otherDietaryRestrictions = user.getOtherDietaryRestrictions();
    this.specialRequests = user.getSpecialRequests();
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getOtherDietaryRestrictions() {
    return otherDietaryRestrictions;
  }

  public void setOtherDietaryRestrictions(String otherDietaryRestrictions) {
    this.otherDietaryRestrictions = otherDietaryRestrictions;
  }

  public String getSpecialRequests() {
    return specialRequests;
  }

  public void setSpecialRequests(String specialRequests) {
    this.specialRequests = specialRequests;
  }

}
