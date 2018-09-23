package de.fh.dao;

import de.fh.entity.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShipmentDao extends MongoRepository<Shipment, Integer> {

  public Shipment findById(Integer Id);
}

