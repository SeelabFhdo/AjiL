package de.fhdortmund.service.usermanagement.dao;

import de.fhdortmund.service.usermanagement.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {

  public User findByEmail(String email);

  public User findByUsername(String username);
}

