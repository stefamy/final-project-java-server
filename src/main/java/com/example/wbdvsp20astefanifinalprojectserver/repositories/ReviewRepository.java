package com.example.wbdvsp20astefanifinalprojectserver.repositories;

import com.example.wbdvsp20astefanifinalprojectserver.models.Review;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {

  @Query(value = "SELECT * FROM Review review LIMIT :limit", nativeQuery = true)
  List<Review> findAllReviews(@Param("limit") Integer limit);


  @Query(value ="SELECT * FROM Review review WHERE user_id=:userId", nativeQuery = true)
  public List<Review> findAllReviewsByUserId(@Param("userId") Integer userId);


  @Query(value ="SELECT * FROM Review review WHERE recipe_id=:foodId", nativeQuery = true)
  public List<Review> findAllReviewsForFoodId(@Param("foodId") Integer foodId);


  @Query(value ="SELECT * FROM Review review WHERE id=:id", nativeQuery = true)
  public Review findReviewByReviewId(@Param("id") Integer id);



}
