package de.fhdortmund.service.authentication.service;

import de.fhdortmund.service.authentication.entities.User;

public interface UserService {

  public User findByEmail(String email);

  public User findByUsername(String username);
}
