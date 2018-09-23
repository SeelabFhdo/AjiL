package de.fh.service.impl;

import de.fh.dao.*;
import de.fh.entity.*;
import de.fh.service.CargoInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargoInterfaceServiceImpl implements CargoInterfaceService {

  private CargoDao cargoDao;

  public CargoInterfaceServiceImpl() {
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
  public Cargo createCargo(Cargo cargo) {
    cargoDao.save(cargo);
    return cargoDao.findById(cargo.getId());
  }

  @Override
  public Cargo readCargo(int Id) {
    return cargoDao.findById(Id);
  }

  @Override
  public Cargo updateCargo(Cargo cargo) {
    cargoDao.save(locationE);
    return cargoDao.findById(locationE.getId());
  }

  @Override
  public void deleteCargo(Cargo cargo) {
    cargoDao.delete(cargo);
  }
}
