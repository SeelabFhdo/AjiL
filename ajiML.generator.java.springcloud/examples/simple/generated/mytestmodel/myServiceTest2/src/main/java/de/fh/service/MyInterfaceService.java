package de.fh.service;

import de.fh.entity.*;

public interface MyInterfaceService {

  public MyEntity createMyEntity(MyEntity myEntity);
  public MyEntity readMyEntity(int Id);
  public MySecondEntity readMySecondEntity(int Id);

}
