package inheritance.vehicle;

import inheritance.person.Driver;

public class Taxi extends Vehicle {
  public Taxi(Driver driver, Engine engine) {
    super(driver, engine);
  }

  @Override
  public void openDoor() {}

  @Override
  public void closeDoor() {}
}
