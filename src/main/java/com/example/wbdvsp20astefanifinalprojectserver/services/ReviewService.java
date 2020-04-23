package com.example.wbdvsp20astefanifinalprojectserver.services;

import com.example.wbdvsp20astefanifinalprojectserver.models.Assignment;
import com.example.wbdvsp20astefanifinalprojectserver.models.Review;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.EventRepository;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.ReviewRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

  @Autowired
  ReviewRepository repository;

  public Review createReview(Integer recipeId, Review review) {
    review.setRecipeId(recipeId);
    return repository.save(review);
  }

  public Review findReviewByReviewId(Integer reviewId) {
    return repository.findReviewByReviewId(reviewId);
  }

  public List<Review> findAllReviews(Integer limit) {
    return repository.findAllReviews(limit);
  }

  public List<Review> findAllReviewsByUserId(Integer userId) {
    return repository.findAllReviewsByUserId(userId);
  }

  public List<Review> findAllReviewsForFoodId(Integer userId) {
    return repository.findAllReviewsForFoodId(userId);
  }

  public int updateReview(Integer reviewId, Review review) {
    repository.save(review);
    return 1;
  }

  public int deleteReview(Integer reviewId) {
    repository.deleteById(reviewId);
    return 1;
  }


}
