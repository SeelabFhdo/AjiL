package de.fh.dao;

import de.fh.entity.*;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository<Customer, Integer> {
	public Customer findById(Integer Id);
}

