package com.example.wbdvsp20astefanifinalprojectserver.controllers;

import com.example.wbdvsp20astefanifinalprojectserver.models.Review;
import com.example.wbdvsp20astefanifinalprojectserver.services.ReviewService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

  @RestController
  @CrossOrigin(origins = "*", allowCredentials = "true")
  public class ReviewController {


    @Autowired
    ReviewService service;

    // CREATE Review for an event
    @PostMapping("/api/recipes/{recipeId}/reviews")
    public Review createReview(@PathVariable("recipeId") Integer recipeId, @RequestBody Review review) {
      return service.createReview(recipeId, review);
    }

    // READ An review by ID
    @GetMapping("/api/reviews/{reviewId}")
    public Review findReviewByReviewId(@PathVariable("reviewId") Integer reviewId) {
      return service.findReviewByReviewId(reviewId);
    }

    // READ All reviews for recipe
    @GetMapping("/api/recipes/{foodId}/reviews")
    public List<Review> findAllReviewsForFoodId(@PathVariable("foodId") Integer foodId) {
      return service.findAllReviewsForFoodId(foodId);
    }

    // READ All reviews by user id
    @GetMapping("/api/user/{userId}/reviews")
    public List<Review> findAllReviewsByUserId(@PathVariable("userId") Integer userId) {
      return service.findAllReviewsByUserId(userId);
    }

    // READ All reviews for recipe
    @GetMapping("/api/reviews/limit/{limit}")
    public List<Review> findAllReviews(@PathVariable("limit") Integer limit) {
      return service.findAllReviews(limit);
    }


    // UPDATE An review
    @PutMapping("/api/reviews/{reviewId}")
    public int updateReview(@PathVariable("reviewId") Integer reviewId, @RequestBody Review review) {
      return service.updateReview(reviewId, review);
    }

    // DELETE An event
    @DeleteMapping("/api/reviews/{reviewId}")
    public int deleteReview(@PathVariable("reviewId") Integer reviewId) {
      return service.deleteReview(reviewId);
    }

  }
