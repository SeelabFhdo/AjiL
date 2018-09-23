package de.fh.dao;

import de.fh.entity.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MySecondEntityDao extends MongoRepository<MySecondEntity, Integer> {

  public MySecondEntity findById(Integer Id);
}

