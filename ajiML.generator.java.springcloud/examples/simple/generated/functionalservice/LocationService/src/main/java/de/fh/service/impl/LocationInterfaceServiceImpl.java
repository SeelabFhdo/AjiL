package de.fh.service.impl;

import de.fh.dao.*;
import de.fh.entity.*;
import de.fh.service.LocationInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationInterfaceServiceImpl implements LocationInterfaceService {

  private LocationEDao locationEDao;
  private MoonEDao moonEDao;

  public LocationInterfaceServiceImpl() {
  }

  @Autowired
  public void setLocationEDao(LocationEDao locationEDao) {
    this.locationEDao = locationEDao;
  }
  @Autowired
  public void setMoonEDao(MoonEDao moonEDao) {
    this.moonEDao = moonEDao;
  }

  @Override
  public LocationE createLocationE(LocationE locationE) {
    locationEDao.save(locationE);
    return locationEDao.findById(locationE.getId());
  }
  @Override
  public MoonE createMoonE(MoonE moonE) {
    moonEDao.save(moonE);
    return moonEDao.findById(moonE.getId());
  }

  @Override
  public LocationE readLocationE(int Id) {
    return locationEDao.findById(Id);
  }
  @Override
  public MoonE readMoonE(int Id) {
    return moonEDao.findById(Id);
  }

  @Override
  public LocationE updateLocationE(LocationE locationE) {
    locationEDao.save(locationE);
    return locationEDao.findById(locationE.getId());
  }

  @Override
  public void deleteLocationE(LocationE locationE) {
    locationEDao.delete(locationE);
  }
}
