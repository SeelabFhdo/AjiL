package de.fh.entity;
import org.springframework.data.annotation.Id;

public class Shipment {

  @Id
  private Integer id;
  private String shipmentName;
  private int shipmentId;

  public Shipment() {
  }

  public Shipment(
  			String shipmentName,
   			int shipmentId,
			int id) {
   	this.shipmentName = shipmentName;
   	this.shipmentId = shipmentId;
    this.id = id;
  }

  public String getShipmentName() {
    return shipmentName;
  }

  public void setShipmentName(String shipmentName) {
    this.shipmentName = shipmentName;
  }

  public int getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(int shipmentId) {
    this.shipmentId = shipmentId;
  }




  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}

