package de.fh.service;

import de.fh.entity.*;

public interface CargoInterfaceService {

  public Cargo createCargo(Cargo cargo);
  public Cargo updateCargo(Cargo cargo);
  public Cargo readCargo(int Id);
  public void deleteCargo(Cargo cargo);

}
