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
@RequestMapping(value = "/resources/shipmentInterface", produces = "application/json")
public class ShipmentInterfaceRestController {

  private ShipmentInterfaceService shipmentInterfaceService;

  @Autowired
  public ShipmentInterfaceRestController(ShipmentInterfaceService shipmentInterfaceService) {
    this.shipmentInterfaceService = shipmentInterfaceService;
  }

  @PutMapping("/CreateShipment/")
  public String createShipment(
		  			@RequestParam String shipmentName,
		   			@RequestParam int shipmentId,
					 @RequestParam String Id) {
    Shipment shipment = new Shipment(
		  			shipmentName,
		   			shipmentId,
					  Integer.parseInt(Id));
    shipment = shipmentInterfaceService.createShipment(shipment);
    Gson gson = new Gson();
    return gson.toJson(shipment);
  }

  @GetMapping("/ReadShipment/{Id}")
  public String readShipment(@PathVariable String Id) {
    Gson gson = new Gson();
	Shipment shipment = shipmentInterfaceService.readShipment(Integer.parseInt(Id));
    if (shipment == null) {
      throw new InvalidParameterException("No Shipment with Id: " + Id);
    }
    return gson.toJson(shipment);
  }	

  @PostMapping("/UpdateShipment/")
  public String updateShipment(
	  			@RequestParam String shipmentName,
	   			@RequestParam int shipmentId,
				 @RequestParam String Id) {
	  Shipment shipment = new Shipment(
	  			shipmentName,
	   			shipmentId,
					  Integer.parseInt(Id));
	shipment = shipmentInterfaceService.updateShipment(shipment);
	Gson gson = new Gson();
	return gson.toJson(shipment);
	}

  @DeleteMapping("/DeleteShipment/{Id}")
  public String deleteShipment(@PathVariable String Id) {
  	Shipment shipment = shipmentInterfaceService.readShipment(Integer.parseInt(Id));
	Gson gson = new Gson();
	if (shipment != null) {
      shipmentInterfaceService.deleteShipment(shipment);
      return gson.toJson(shipment);
    } else
      throw new InvalidParameterException("No LocationInterface with Id: " + Id);
  }

}

