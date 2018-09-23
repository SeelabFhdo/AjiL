package de.fh.service.impl;

import de.fh.dao.*;
import de.fh.entity.*;
import de.fh.service.MySecondInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySecondInterfaceServiceImpl implements MySecondInterfaceService {

  private MyEntityDao myEntityDao;

  public MySecondInterfaceServiceImpl() {
  }

  @Autowired
  public void setMyEntityDao(MyEntityDao myEntityDao) {
    this.myEntityDao = myEntityDao;
  }

  @Override
  public MyEntity createMyEntity(MyEntity myEntity) {
    myEntityDao.save(myEntity);
    return myEntityDao.findById(myEntity.getId());
  }

  @Override
  public MyEntity readMyEntity(int Id) {
    return myEntityDao.findById(Id);
  }


}
