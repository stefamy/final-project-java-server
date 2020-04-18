package com.example.wbdvsp20astefanifinalprojectserver.models;

public class Food {

  private Integer id;
  private String tasteCat;
  private String dishCat;
  private Integer glutenFree;
  private Integer vegetarian;
  private Integer vegan;
  private Integer nutFree;
  private String otherDietaryNotes;
  private String recipeLink;
  private Integer internalRecipe;

  public Food(Integer id) {
    this.id = id;
  }

  public Food(String tasteCat, String dishCat, Integer glutenFree,
      Integer vegetarian, Integer vegan, Integer nutFree, String otherDietaryNotes,
      String recipeLink, Integer internalRecipe) {
    this.tasteCat = tasteCat;
    this.dishCat = dishCat;
    this.glutenFree = glutenFree;
    this.vegetarian = vegetarian;
    this.vegan = vegan;
    this.nutFree = nutFree;
    this.otherDietaryNotes = otherDietaryNotes;
    this.recipeLink = recipeLink;
    this.internalRecipe = internalRecipe;
  }

  public Food(Integer id, String tasteCat, String dishCat, Integer glutenFree,
      Integer vegetarian, Integer vegan, Integer nutFree, String otherDietaryNotes,
      String recipeLink, Integer internalRecipe) {
    this.id = id;
    this.tasteCat = tasteCat;
    this.dishCat = dishCat;
    this.glutenFree = glutenFree;
    this.vegetarian = vegetarian;
    this.vegan = vegan;
    this.nutFree = nutFree;
    this.otherDietaryNotes = otherDietaryNotes;
    this.recipeLink = recipeLink;
    this.internalRecipe = internalRecipe;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTasteCat() {
    return tasteCat;
  }

  public void setTasteCat(String tasteCat) {
    this.tasteCat = tasteCat;
  }

  public String getDishCat() {
    return dishCat;
  }

  public void setDishCat(String dishCat) {
    this.dishCat = dishCat;
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

  public Integer getNutFree() {
    return nutFree;
  }

  public void setNutFree(Integer nutFree) {
    this.nutFree = nutFree;
  }

  public String getOtherDietaryNotes() {
    return otherDietaryNotes;
  }

  public void setOtherDietaryNotes(String otherDietaryNotes) {
    this.otherDietaryNotes = otherDietaryNotes;
  }

  public String getRecipeLink() {
    return recipeLink;
  }

  public void setRecipeLink(String recipeLink) {
    this.recipeLink = recipeLink;
  }

  public Integer getInternalRecipe() {
    return internalRecipe;
  }

  public void setInternalRecipe(Integer internalRecipe) {
    this.internalRecipe = internalRecipe;
  }
}
