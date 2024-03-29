package com.example.wbdvsp20astefanifinalprojectserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String username;
  private String password;

  private String firstName;
  private String lastName;

  private String email;
  private String phone;

  private String streetAddress1;
  private String streetAddress2;
  private String city;
  private String state;
  private String zip;

  private Integer glutenFree;
  private Integer vegetarian;
  private Integer vegan;
  private Integer nutAllergy;

  private String otherDietaryRestrictions;
  private String specialRequests;

  private Integer accountClaimed;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getStreetAddress1() {
    return streetAddress1;
  }

  public void setStreetAddress1(String streetAddress1) {
    this.streetAddress1 = streetAddress1;
  }

  public String getStreetAddress2() {
    return streetAddress2;
  }

  public void setStreetAddress2(String streetAddress2) {
    this.streetAddress2 = streetAddress2;
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

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Integer getGlutenFree() {
    return glutenFree;
  }

  public void setGlutenFree(Integer glutenFree) {
    this.glutenFree = glutenFree;
  }


  public Integer getVegetarian() {
    return vegetarian;
  }

  public void setVegetarian(Integer vegetarian) {
    this.vegetarian = vegetarian;
  }


  public Integer getVegan() {
    return vegan;
  }

  public void setVegan(Integer vegan) {
    this.vegan = vegan;
  }


  public Integer getNutAllergy() {
    return nutAllergy;
  }

  public void setNutAllergy(Integer nutAllergy) {
    this.nutAllergy = nutAllergy;
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

  public Integer getAccountClaimed() {
    return accountClaimed;
  }

  public void setAccountClaimed(Integer accountClaimed) {
    this.accountClaimed = accountClaimed;
  }

  public User cloaked() {
    this.password = "***";
    return this;
  }

  public User publicProfile() {
    this.password = "***";
    this.lastName = lastName.substring(0,0);
    this.phone = "";
    this.streetAddress1 = "";
    this.streetAddress2 = "";
    this.city = "";
    this.state = "";
    this.zip = "";

    return this;
  }


}
