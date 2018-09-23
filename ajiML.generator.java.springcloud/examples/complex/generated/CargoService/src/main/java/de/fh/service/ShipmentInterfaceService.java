package de.fh.service;

import de.fh.entity.*;

public interface ShipmentInterfaceService {

  public Shipment createShipment(Shipment shipment);
  public Shipment updateShipment(Shipment shipment);
  public Shipment readShipment(int Id);
  public void deleteShipment(Shipment shipment);

}
