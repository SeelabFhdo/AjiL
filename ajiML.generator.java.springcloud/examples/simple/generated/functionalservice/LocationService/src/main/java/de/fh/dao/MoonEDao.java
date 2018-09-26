package de.fh.dao;

import de.fh.entity.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MoonEDao extends MongoRepository<MoonE, Integer> {

  public MoonE findById(Integer Id);
}

