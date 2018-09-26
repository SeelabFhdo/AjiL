package de.fh.service;

import de.fh.entity.*;

public interface LocationInterfaceService {

  public LocationE createLocationE(LocationE locationE);
  public MoonE createMoonE(MoonE moonE);
  public LocationE updateLocationE(LocationE locationE);
  public LocationE readLocationE(int Id);
  public MoonE readMoonE(int Id);
  public void deleteLocationE(LocationE locationE);

}
