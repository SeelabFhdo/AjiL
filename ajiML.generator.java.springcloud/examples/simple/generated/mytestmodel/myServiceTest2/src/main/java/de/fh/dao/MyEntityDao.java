package de.fh.dao;

import de.fh.entity.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyEntityDao extends MongoRepository<MyEntity, Integer> {

  public MyEntity findById(Integer Id);
}

