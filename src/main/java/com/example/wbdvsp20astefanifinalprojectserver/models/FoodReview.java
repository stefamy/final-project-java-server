package com.example.wbdvsp20astefanifinalprojectserver.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FoodReview {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer foodId;
  private Integer reviewerId;
  private Integer supplierId;
  private Integer rating;
  private String review;

  public FoodReview(Integer id, Integer foodId, Integer reviewerId, Integer supplierId, Integer rating,
      String review) {
    this.id = id;
    this.foodId = foodId;
    this.reviewerId = reviewerId;
    this.supplierId = supplierId;
    this.rating = rating;
    this.review = review;
  }


  public FoodReview(Integer foodId, Integer reviewerId, Integer supplierId, Integer rating,
      String review) {
    this.foodId = foodId;
    this.reviewerId = reviewerId;
    this.supplierId = supplierId;
    this.rating = rating;
    this.review = review;
  }

  public FoodReview(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public Integer getFoodId() {
    return foodId;
  }

  public Integer getReviewerId() {
    return reviewerId;
  }

  public Integer getSupplierId() {
    return supplierId;
  }

  public Integer getRating() {
    return rating;
  }

  public String getReview() {
    return review;
  }
}
