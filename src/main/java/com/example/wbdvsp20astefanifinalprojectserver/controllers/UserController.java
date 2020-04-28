package com.example.wbdvsp20astefanifinalprojectserver.controllers;

import com.example.wbdvsp20astefanifinalprojectserver.models.UserData;
import com.example.wbdvsp20astefanifinalprojectserver.models.User;
import com.example.wbdvsp20astefanifinalprojectserver.models.UserAvailability;
import com.example.wbdvsp20astefanifinalprojectserver.services.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true")
public class UserController {


  @Autowired
  UserService service;

  /* ----- Authenticated user requests ----- */

  @PostMapping("/register")
  public User register(HttpSession session,
      @RequestBody User user) {
    User newUser = service.createNewUser(user);
    session.setAttribute("profile", newUser);
    return newUser;
  }

  @PostMapping("/register/validate")
  public UserAvailability areEmailAndUsernameAvailable(@RequestBody User user) {
    UserAvailability result = service.areEmailAndUsernameAvailable(user);
    return result;
  }

  @PostMapping("/login")
  public User login(HttpSession session, @RequestBody User user) {
    User foundUser = service.findUserByCredentials(user.getUsername(), user.getPassword());
    session.setAttribute("profile", foundUser);
    return foundUser;
  }

  @PostMapping("/logout")
  public void logout(HttpSession session) {
    session.invalidate();
  }

  @PostMapping("/user")
  public User findUser(HttpSession session) {
    User user = (User) session.getAttribute("profile");
    return user;
  }

  @PostMapping("/user/upcoming")
  public UserData findCurrentUserData(HttpSession session) {
    User user = (User) session.getAttribute("profile");
    if (user != null) {
      return service.findCurrentUserData(user);
    }
    return null;
  }

  @PutMapping("/user")
  public User updateUser(HttpSession session, @RequestBody User updatedUser) {
    User user = service.updateUser(updatedUser);
    session.setAttribute("user", user);
    return user;
  }

  /* ----- Rest API user requests ----- */

  @GetMapping("/api/users/{username}")
  public User findUserByUsername(@PathVariable("username") String username) {
    User user = service.findUserByUsername(username);
    return user;
  }




}

//        java -jar target/*.jar
