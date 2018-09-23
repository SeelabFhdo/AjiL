package de.fh.service.impl;

import de.fh.dao.*;
import de.fh.entity.*;
import de.fh.service.CustomerInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerInterfaceServiceImpl implements CustomerInterfaceService {

  private CustomerDao customerDao;

  public CustomerInterfaceServiceImpl() {
  }

  @Autowired
  public void setCustomerDao(CustomerDao customerDao) {
    this.customerDao = customerDao;
  }

  @Override
  public Customer createCustomer(Customer customer) {
    customerDao.save(customer);
    return customerDao.findById(customer.getId());
  }

  @Override
  public Customer readCustomer(int Id) {
    return customerDao.findById(Id);
  }

  @Override
  public Customer updateCustomer(Customer customer) {
    customerDao.save(locationE);
    return customerDao.findById(locationE.getId());
  }

  @Override
  public void deleteCustomer(Customer customer) {
    customerDao.delete(customer);
  }
}
