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
@RequestMapping(value = "/resources/locationinterface", produces = "application/json")
public class LocationInterfaceRestController {

  private LocationInterfaceService locationInterfaceService;

  @Autowired
  public LocationInterfaceRestController(LocationInterfaceService locationInterfaceService) {
    this.locationInterfaceService = locationInterfaceService;
  }

  @PutMapping("/createlocation/")
  public String createLocationE(
		  			@RequestParam String street,
		   			@RequestParam int locationId,
		   			@RequestParam boolean status,
		   			@RequestParam String streetChar,
		  	 		@RequestParam float price,
					 @RequestParam String Id) {
    LocationE locationE = new LocationE(
		  			street,
		   			locationId,
		   			status,
		   			streetChar,
		  	 		price,
					  Integer.parseInt(Id));
    locationE = locationInterfaceService.createLocationE(locationE);
    Gson gson = new Gson();
    return gson.toJson(locationE);
  }

  @PutMapping("/createmoon/")
  public String createMoonE(
		  			@RequestParam String moonName,
					 @RequestParam String Id) {
    MoonE moonE = new MoonE(
		  			moonName,
					  Integer.parseInt(Id));
    moonE = locationInterfaceService.createMoonE(moonE);
    Gson gson = new Gson();
    return gson.toJson(moonE);
  }

  @GetMapping("/readlocation/{Id}")
  public String readLocationE(@PathVariable String Id) {
    Gson gson = new Gson();
	LocationE locationE = locationInterfaceService.readLocationE(Integer.parseInt(Id));
    if (locationE == null) {
      throw new InvalidParameterException("No LocationE with Id: " + Id);
    }
    return gson.toJson(locationE);
  }	

  @GetMapping("/readmoon/{Id}")
  public String readMoonE(@PathVariable String Id) {
    Gson gson = new Gson();
	MoonE moonE = locationInterfaceService.readMoonE(Integer.parseInt(Id));
    if (moonE == null) {
      throw new InvalidParameterException("No MoonE with Id: " + Id);
    }
    return gson.toJson(moonE);
  }	

  @PostMapping("/updatelocation/")
  public String updateLocationE(
	  			@RequestParam String street,
	   			@RequestParam int locationId,
	   			@RequestParam boolean status,
	   			@RequestParam String streetChar,
	  	 		@RequestParam float price,
				 @RequestParam String Id) {
	  LocationE locationE = new LocationE(
	  			street,
	   			locationId,
	   			status,
	   			streetChar,
	  	 		price,
					  Integer.parseInt(Id));
	locationE = locationInterfaceService.updateLocationE(locationE);
	Gson gson = new Gson();
	return gson.toJson(locationE);
	}

  @DeleteMapping("/deletelocation/{Id}")
  public String deleteLocationE(@PathVariable String Id) {
  	LocationE locationE = locationInterfaceService.readLocationE(Integer.parseInt(Id));
	Gson gson = new Gson();
	if (locationE != null) {
      locationInterfaceService.deleteLocationE(locationE);
      return gson.toJson(locationE);
    } else
      throw new InvalidParameterException("No LocationInterface with Id: " + Id);
  }

}

