package com.example.wbdvsp20astefanifinalprojectserver.repositories;

import com.example.wbdvsp20astefanifinalprojectserver.models.User;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

//@Repository
public interface UserRepository
    extends CrudRepository<User, Integer> {

  @Query(value = "SELECT * FROM User user WHERE username=:username AND password=:password", nativeQuery = true)
  User findUserByCredentials(
      @Param("username") String username, @Param("password") String password
  );

  @Query(value = "SELECT * FROM User user WHERE id=:userId", nativeQuery = true)
  User findUserByUserId(
      @Param("userId") String userId
  );

  @Query(value = "SELECT * FROM User user WHERE email=:email", nativeQuery = true)
  User findUserByEmailAddress(
      @Param("email") String email
  );

  @Query(value = "SELECT * FROM User user WHERE id=:id", nativeQuery = true)
  User findUserById(
      @Param("id") Integer id
  );

  @Query(value = "SELECT * FROM User user", nativeQuery = true)
  List<User> findAllUsers();


}
