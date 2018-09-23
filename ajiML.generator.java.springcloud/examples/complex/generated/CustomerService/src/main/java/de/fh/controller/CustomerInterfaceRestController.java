package de.fh.controller;

import com.google.gson.Gson;
import de.fh.entity.*;
import de.fh.service.*;
import java.security.InvalidParameterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/resources/customerInterface", produces = "application/json")
public class CustomerInterfaceRestController {

  private CustomerInterfaceService customerInterfaceService;

  @Autowired
  public CustomerInterfaceRestController(CustomerInterfaceService customerInterfaceService) {
    this.customerInterfaceService = customerInterfaceService;
  }

  @PutMapping("/CreateCustomer/")
  public String createCustomer(
		  			@RequestParam String name,
		   			@RequestParam int id,
		   			@RequestParam boolean trustful,
		   			@RequestParam String nameChar,
		  	 		@RequestParam float credit,
					 @RequestParam String Id) {
    Customer customer = new Customer(
		  			name,
		   			id,
		   			trustful,
		   			nameChar,
		  	 		credit,
					  Integer.parseInt(Id));
    customer = customerInterfaceService.createCustomer(customer);
    Gson gson = new Gson();
    return gson.toJson(customer);
  }

  @GetMapping("/ReadCustomer/{Id}")
  public String readCustomer(@PathVariable String Id) {
    Gson gson = new Gson();
	Customer customer = customerInterfaceService.readCustomer(Integer.parseInt(Id));
    if (customer == null) {
      throw new InvalidParameterException("No Customer with Id: " + Id);
    }
    return gson.toJson(customer);
  }	

  @PostMapping("/UpdateCustomer/")
  public String updateCustomer(
	  			@RequestParam String name,
	   			@RequestParam int id,
	   			@RequestParam boolean trustful,
	   			@RequestParam String nameChar,
	  	 		@RequestParam float credit,
				 @RequestParam String Id) {
	  Customer customer = new Customer(
	  			name,
	   			id,
	   			trustful,
	   			nameChar,
	  	 		credit,
					  Integer.parseInt(Id));
	customer = customerInterfaceService.updateCustomer(customer);
	Gson gson = new Gson();
	return gson.toJson(customer);
	}

  @DeleteMapping("/DeleteCustomer/{Id}")
  public String deleteCustomer(@PathVariable String Id) {
  	Customer customer = customerInterfaceService.readCustomer(Integer.parseInt(Id));
	Gson gson = new Gson();
	if (customer != null) {
      customerInterfaceService.deleteCustomer(customer);
      return gson.toJson(customer);
    } else
      throw new InvalidParameterException("No LocationInterface with Id: " + Id);
  }

}

