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
@RequestMapping(value = "/resources/mysecondinterface", produces = "application/json")
public class MySecondInterfaceRestController {

  private MySecondInterfaceService mySecondInterfaceService;

  @Autowired
  public MySecondInterfaceRestController(MySecondInterfaceService mySecondInterfaceService) {
    this.mySecondInterfaceService = mySecondInterfaceService;
  }

  @PutMapping("/createability/")
  public String createMyEntity(
					 @RequestParam String Id) {
    MyEntity myEntity = new MyEntity(
					  Integer.parseInt(Id));
    myEntity = mySecondInterfaceService.createMyEntity(myEntity);
    Gson gson = new Gson();
    return gson.toJson(myEntity);
  }

  @GetMapping("/readability/{Id}")
  public String readMyEntity(@PathVariable String Id) {
    Gson gson = new Gson();
	MyEntity myEntity = mySecondInterfaceService.readMyEntity(Integer.parseInt(Id));
    if (myEntity == null) {
      throw new InvalidParameterException("No MyEntity with Id: " + Id);
    }
    return gson.toJson(myEntity);
  }	

}

