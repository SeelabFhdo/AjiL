package de.fh.service.impl;

import de.fh.dao.*;
import de.fh.entity.*;
import de.fh.service.MyInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyInterfaceServiceImpl implements MyInterfaceService {

  private MyEntityDao myEntityDao;
  private MySecondEntityDao mySecondEntityDao;

  public MyInterfaceServiceImpl() {
  }

  @Autowired
  public void setMyEntityDao(MyEntityDao myEntityDao) {
    this.myEntityDao = myEntityDao;
  }
  @Autowired
  public void setMySecondEntityDao(MySecondEntityDao mySecondEntityDao) {
    this.mySecondEntityDao = mySecondEntityDao;
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
  @Override
  public MySecondEntity readMySecondEntity(int Id) {
    return mySecondEntityDao.findById(Id);
  }


}
