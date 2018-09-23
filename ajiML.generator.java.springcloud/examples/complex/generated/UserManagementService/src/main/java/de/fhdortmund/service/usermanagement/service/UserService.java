package de.fhdortmund.service.usermanagement.service;

import de.fhdortmund.service.usermanagement.entities.User;

public interface UserService {

  public User findByEmail(String email);

  public User findByUsername(String username);

  public User saveUser(User user);

  public void deleteUser(User user);

}
