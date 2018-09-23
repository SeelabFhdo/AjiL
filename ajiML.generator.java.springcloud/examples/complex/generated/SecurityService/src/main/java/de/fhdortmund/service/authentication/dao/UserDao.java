package de.fhdortmund.service.authentication.dao;

import de.fhdortmund.service.authentication.entities.User;
import org.springframework.data.repository.CrudRepository;


public interface UserDao extends CrudRepository<User, Long> {

  public User findByEmail(String email);

  public User findByUsername(String username);
}
