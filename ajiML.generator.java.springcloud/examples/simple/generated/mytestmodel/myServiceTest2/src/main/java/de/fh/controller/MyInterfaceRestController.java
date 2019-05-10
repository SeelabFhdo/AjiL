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
@RequestMapping(value = "/resources/myinterface", produces = "application/json")
public class MyInterfaceRestController {

  private MyInterfaceService myInterfaceService;

  @Autowired
  public MyInterfaceRestController(MyInterfaceService myInterfaceService) {
    this.myInterfaceService = myInterfaceService;
  }

  @PutMapping("/createe1ability/")
  public String createMyEntity(
		   			@RequestParam int age,
		   			@RequestParam boolean booleanAttribute,
					 @RequestParam String Id) {
    MyEntity myEntity = new MyEntity(
		   			age,
		   			booleanAttribute,
					  Integer.parseInt(Id));
    myEntity = myInterfaceService.createMyEntity(myEntity);
    Gson gson = new Gson();
    return gson.toJson(myEntity);
  }

  @GetMapping("/reade1ability/{Id}")
  public String readMyEntity(@PathVariable String Id) {
    Gson gson = new Gson();
	MyEntity myEntity = myInterfaceService.readMyEntity(Integer.parseInt(Id));
    if (myEntity == null) {
      throw new InvalidParameterException("No MyEntity with Id: " + Id);
    }
    return gson.toJson(myEntity);
  }	

  @GetMapping("/reade2ability/{Id}")
  public String readMySecondEntity(@PathVariable String Id) {
    Gson gson = new Gson();
	MySecondEntity mySecondEntity = myInterfaceService.readMySecondEntity(Integer.parseInt(Id));
    if (mySecondEntity == null) {
      throw new InvalidParameterException("No MySecondEntity with Id: " + Id);
    }
    return gson.toJson(mySecondEntity);
  }	

}

