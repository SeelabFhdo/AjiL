package de.fhdortmund.service.usermanagement.service.impl;

import de.fhdortmund.service.usermanagement.dao.UserDao;
import de.fhdortmund.service.usermanagement.entities.User;
import de.fhdortmund.service.usermanagement.service.UserService;
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

  @Override
  public User saveUser(User user) {
    return userDao.save(user);
  }

  @Override
  public void deleteUser(User user) {
    userDao.delete(user);
  }
}
