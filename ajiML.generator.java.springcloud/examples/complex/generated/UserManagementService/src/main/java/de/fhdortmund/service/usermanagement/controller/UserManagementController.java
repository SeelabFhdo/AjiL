package de.fhdortmund.service.usermanagement.controller;

import com.google.gson.Gson;
import de.fhdortmund.service.usermanagement.entities.User;
import de.fhdortmund.service.usermanagement.service.UserService;
import java.security.InvalidParameterException;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/resources/user", produces = "application/json")
public class UserManagementController {

  private UserService userService;

  @Autowired
  public UserManagementController(UserService userService) {
    this.userService = userService;
  }

  /**
   * Request mapping for creating a user.
   *
   * @param email email adress of the user
   * @param surName lastname of the user
   * @param firstName firstname of the user
   * @param username username, must be unique
   * @param password password of the user
   * @return id of the user
   */
  @PutMapping("/register")
  public String register(Principal principal,
      @RequestParam String email,
      @RequestParam String surName,
      @RequestParam String firstName,
      @RequestParam String username,
      @RequestParam String password) {

    if (!email.contains("@")) {
      throw new InvalidParameterException("Invalid Email Address");
    }

    if (userService.findByEmail(email) != null) {
      throw new InvalidParameterException("Email Address already in use");
    } else {
      User user = new User(email, surName, firstName, username, password);
      userService.saveUser(user);
      Gson gson = new Gson();
      return gson.toJson(user);
    }
  }

  /**
   * Request mapping for deleting a user.
   *
   * @param id of the useraccount
   * @return status message
   */
  @DeleteMapping("/delete")
  public String delete(long id) {
    try {
      User user = new User(id);
      userService.deleteUser(user);
    } catch (Exception ex) {
      throw new InvalidParameterException("User not FoundException");
    }
    return "User succesfully deleted!";
  }

  /**
   * Request mapping for getting the user id by email address.
   *
   * @param email email of the user
   * @return user id
   */
  @GetMapping("/email/{email}")
  public String getByEmail(@PathVariable String email) {
    User user = null;
    try {
      user = userService.findByEmail(email);
    } catch (Exception ex) {
      throw new InvalidParameterException("User not FoundException");
    }
    Gson gson = new Gson();
    return gson.toJson(user);
  }

  /**
   * Request mapping for getting the user by username.
   *
   * @param username of the user
   * @return user object
   */
  @GetMapping("/username/{username}")
  public String getByUsername(@PathVariable String username) {
    User user;
    try {
      user = userService.findByUsername(username);
    } catch (Exception ex) {
      return null;
    }
    Gson gson = new Gson();
    return gson.toJson(user);
  }

}
