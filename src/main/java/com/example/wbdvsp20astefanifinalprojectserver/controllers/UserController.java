package com.example.wbdvsp20astefanifinalprojectserver.controllers;

import com.example.wbdvsp20astefanifinalprojectserver.models.User;
import com.example.wbdvsp20astefanifinalprojectserver.services.UserService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true")
public class UserController {


  @Autowired
  UserService service;

  @PostMapping("/logout")
  public void logout(HttpSession session) {
    session.invalidate();
  }

  @PostMapping("/login")
  public User login(HttpSession session, @RequestBody User user) {
    User profile = service.findUserByCredentials(user.getUsername(), user.getPassword());
    session.setAttribute("profile", profile);
    return profile;
  }

  @PostMapping("/register")
  public User register(HttpSession session,
      @RequestBody User user) {
    User newUser = service.createNewUser(user);
    session.setAttribute("profile", newUser);
    return newUser;
  }

  @PostMapping("/profile")
  public User profile(HttpSession session) {
    User profile = (User) session.getAttribute("profile");
    return profile;
  }

  @PutMapping("/profile")
  public User updateProfile(HttpSession session, @RequestBody User updatedUser) {
    User updatedProfile = service.updateUser(updatedUser);
    session.setAttribute("profile", updatedProfile);
    return updatedProfile;
  }

  @GetMapping("/api/users")
  public List<User> testFindAllUsers() {
    return service.findAllUsers();
  }


}

//        java -jar target/*.jar
