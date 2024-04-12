package inheritance.vehicle;

import inheritance.person.Driver;

public class Motorcycle extends Vehicle {
  public Motorcycle(Driver driver, Engine engine) {
    super(driver, engine);
  }

  @Override
  public void openDoor() {}

  @Override
  public void closeDoor() {}
}
