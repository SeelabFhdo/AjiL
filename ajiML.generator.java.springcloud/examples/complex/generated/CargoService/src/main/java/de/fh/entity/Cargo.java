package de.fh.entity;
import org.springframework.data.annotation.Id;

public class Cargo {

  @Id
  private Integer id;
  private String cargoName;
  private int id;
  private boolean paid;
  private float price;

  public Cargo() {
  }

  public Cargo(
  			String cargoName,
   			int id,
   			boolean paid,
  	 		float price,
			int id) {
   	this.cargoName = cargoName;
   	this.id = id;
   	this.paid = paid; 
    this.price = price; 
    this.id = id;
  }

  public String getCargoName() {
    return cargoName;
  }

  public void setCargoName(String cargoName) {
    this.cargoName = cargoName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean getPaid() {
    return paid;
  }

  public void setPaid(boolean paid) {
    this.paid = paid;
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

