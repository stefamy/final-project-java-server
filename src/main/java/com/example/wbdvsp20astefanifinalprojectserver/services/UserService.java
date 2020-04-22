package com.example.wbdvsp20astefanifinalprojectserver.services;

import com.example.wbdvsp20astefanifinalprojectserver.models.User;
import com.example.wbdvsp20astefanifinalprojectserver.repositories.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public User findUserByCredentials(String username, String password) {
    User newUser = userRepository.findUserByCredentials(username, password);
    if (newUser != null) {
      return newUser.cloaked();
    }
    return null;
  }


  public User findUserByUserId(String userId) {
    return userRepository.findUserByUserId(userId);
  }

  public User findUserByEmailAddress(String email) {
    User updatedUser = userRepository.findUserByEmailAddress(email);
    if (updatedUser != null) {
      return updatedUser.cloaked();
    }
    return null;
  }

  public User createNewUser(User newUser) {
    String email = newUser.getEmail();
    User currentUser = userRepository.findUserByEmailAddress(email);
    if (currentUser != null && currentUser.getAccountClaimed() < 1) {
      // User exists and can be claimed
      currentUser.setUsername(newUser.getUsername());
      currentUser.setPassword(newUser.getPassword());
      currentUser.setAccountClaimed(1);
      userRepository.save(currentUser);
      return currentUser.cloaked();
    } else if (currentUser != null && currentUser.getAccountClaimed() == 1) {
      // User exists and is claimed
      return null;
    } else {
      User createdUser = userRepository.save(newUser);
      return createdUser.cloaked();
    }
  }

  public User updateUser(User user) {
    if (user.getPassword().equals("***")) {
      User oldUser = userRepository.findUserById(user.getId());
      user.setPassword(oldUser.getPassword());
    }
    User updatedUser = userRepository.save(user);
    return updatedUser.cloaked();
  }

  public List<User> findAllUsers() {
    return userRepository.findAllUsers();
  }

}
