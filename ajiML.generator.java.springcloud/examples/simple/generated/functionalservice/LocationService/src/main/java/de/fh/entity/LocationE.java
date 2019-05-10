package de.fh.entity;
import org.springframework.data.annotation.Id;

public class LocationE {

  @Id
  private Integer id;
  private String street;
  private int locationId;
  private boolean status;
  private String streetChar;
  private float price;

  public LocationE() {
  }

  public LocationE(
  			String street,
   			int locationId,
   			boolean status,
   			String streetChar,
  	 		float price,
			int id) {
   	this.street = street;
   	this.locationId = locationId;
   	this.status = status; 
   	this.streetChar = streetChar;
    this.price = price; 
    this.id = id;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getLocationId() {
    return locationId;
  }

  public void setLocationId(int locationId) {
    this.locationId = locationId;
  }

  public boolean getStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public String getStreetChar() {
    return streetChar;
  }

  public void setstreetChar(String streetChar) {
    this.streetChar = streetChar;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}

