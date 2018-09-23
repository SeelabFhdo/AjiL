package de.fhdortmund.service.authentication.service.impl;

import de.fhdortmund.service.authentication.dao.UserDao;
import de.fhdortmund.service.authentication.entities.User;
import de.fhdortmund.service.authentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private UserDao userDao;

  @Autowired
  public UserServiceImpl(UserDao userDao) {
    this.userDao = userDao;
  }

  @Override
  public User findByEmail(String email) {
    return userDao.findByEmail(email);
  }

  @Override
  public User findByUsername(String username) {
    return userDao.findByUsername(username);
  }
}
