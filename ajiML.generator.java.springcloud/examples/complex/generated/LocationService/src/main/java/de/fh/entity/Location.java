package de.fh.entity;
import org.springframework.data.annotation.Id;

public class Location {

  @Id
  private Integer id;
  private String city;
  private String street;
  private int locationId;
  private int postCode;

  public Location() {
  }

  public Location(
  			String city,
  			String street,
   			int locationId,
   			int postCode,
			int id) {
   	this.city = city;
   	this.street = street;
   	this.locationId = locationId;
   	this.postCode = postCode;
    this.id = id;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
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
  public int getPostCode() {
    return postCode;
  }

  public void setPostCode(int postCode) {
    this.postCode = postCode;
  }




  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}

