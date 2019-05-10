package de.fh.dao;

import de.fh.entity.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationEDao extends MongoRepository<LocationE, Integer> {

  public LocationE findById(Integer Id);
}

