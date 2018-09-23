package de.fh.service.impl;

import de.fh.dao.*;
import de.fh.entity.*;
import de.fh.service.ShipmentInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentInterfaceServiceImpl implements ShipmentInterfaceService {

  private ShipmentDao shipmentDao;

  public ShipmentInterfaceServiceImpl() {
  }

  @Autowired
  public void setCargoDao(CargoDao cargoDao) {
    this.cargoDao = cargoDao;
  }
  @Autowired
  public void setShipmentDao(ShipmentDao shipmentDao) {
    this.shipmentDao = shipmentDao;
  }

  @Override
  public Shipment createShipment(Shipment shipment) {
    shipmentDao.save(shipment);
    return shipmentDao.findById(shipment.getId());
  }

  @Override
  public Shipment readShipment(int Id) {
    return shipmentDao.findById(Id);
  }

  @Override
  public Shipment updateShipment(Shipment shipment) {
    shipmentDao.save(locationE);
    return shipmentDao.findById(locationE.getId());
  }

  @Override
  public void deleteShipment(Shipment shipment) {
    shipmentDao.delete(shipment);
  }
}
