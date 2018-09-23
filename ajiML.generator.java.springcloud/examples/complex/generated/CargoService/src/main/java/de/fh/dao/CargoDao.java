package de.fh.dao;

import de.fh.entity.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CargoDao extends MongoRepository<Cargo, Integer> {

  public Cargo findById(Integer Id);
}

