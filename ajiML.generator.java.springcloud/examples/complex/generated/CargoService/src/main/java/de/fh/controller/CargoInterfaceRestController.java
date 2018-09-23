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
@RequestMapping(value = "/resources/cargoInterface", produces = "application/json")
public class CargoInterfaceRestController {

  private CargoInterfaceService cargoInterfaceService;

  @Autowired
  public CargoInterfaceRestController(CargoInterfaceService cargoInterfaceService) {
    this.cargoInterfaceService = cargoInterfaceService;
  }

  @PutMapping("/CreateCargo/")
  public String createCargo(
		  			@RequestParam String cargoName,
		   			@RequestParam int id,
		   			@RequestParam boolean paid,
		  	 		@RequestParam float price,
					 @RequestParam String Id) {
    Cargo cargo = new Cargo(
		  			cargoName,
		   			id,
		   			paid,
		  	 		price,
					  Integer.parseInt(Id));
    cargo = cargoInterfaceService.createCargo(cargo);
    Gson gson = new Gson();
    return gson.toJson(cargo);
  }

  @GetMapping("/ReadCargo/{Id}")
  public String readCargo(@PathVariable String Id) {
    Gson gson = new Gson();
	Cargo cargo = cargoInterfaceService.readCargo(Integer.parseInt(Id));
    if (cargo == null) {
      throw new InvalidParameterException("No Cargo with Id: " + Id);
    }
    return gson.toJson(cargo);
  }	

  @PostMapping("/UpdateCargo/")
  public String updateCargo(
	  			@RequestParam String cargoName,
	   			@RequestParam int id,
	   			@RequestParam boolean paid,
	  	 		@RequestParam float price,
				 @RequestParam String Id) {
	  Cargo cargo = new Cargo(
	  			cargoName,
	   			id,
	   			paid,
	  	 		price,
					  Integer.parseInt(Id));
	cargo = cargoInterfaceService.updateCargo(cargo);
	Gson gson = new Gson();
	return gson.toJson(cargo);
	}

  @DeleteMapping("/DeleteCargo/{Id}")
  public String deleteCargo(@PathVariable String Id) {
  	Cargo cargo = cargoInterfaceService.readCargo(Integer.parseInt(Id));
	Gson gson = new Gson();
	if (cargo != null) {
      cargoInterfaceService.deleteCargo(cargo);
      return gson.toJson(cargo);
    } else
      throw new InvalidParameterException("No LocationInterface with Id: " + Id);
  }

}

