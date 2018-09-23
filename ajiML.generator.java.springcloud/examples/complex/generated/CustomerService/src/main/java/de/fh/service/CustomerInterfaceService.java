package de.fh.service;

import de.fh.entity.*;

public interface CustomerInterfaceService {

  public Customer createCustomer(Customer customer);
  public Customer updateCustomer(Customer customer);
  public Customer readCustomer(int Id);
  public void deleteCustomer(Customer customer);

}
