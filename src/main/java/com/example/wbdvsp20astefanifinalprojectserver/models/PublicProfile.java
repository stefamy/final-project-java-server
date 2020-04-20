package com.example.wbdvsp20astefanifinalprojectserver.models;

public class PublicProfile {

  private Integer id;
  private String username;

  private String firstName;
  private String lastName;

  private Integer glutenFree;
  private Integer vegetarian;
  private Integer vegan;
  private Integer nutAllergy;

  public PublicProfile(User user) {
    this.username = user.getUsername();
    this.id = user.getId();
    this.firstName = user.getFirstName();
    this.lastName = user.getLastName().substring(0, 1);
    this.glutenFree = user.getGlutenFree();
    this.vegetarian = user.getVegetarian();
    this.vegan = user.getVegan();
    this.nutAllergy = user.getNutAllergy();
  }

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
}
