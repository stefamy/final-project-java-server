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

  public User createNewUser(User user) {
    User newUser = userRepository.save(user);
    return newUser.cloaked();
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
