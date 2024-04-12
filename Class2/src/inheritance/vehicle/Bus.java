package inheritance.vehicle;

import inheritance.person.Driver;

public class Bus extends Vehicle {
  private Door door;
  private Route route;

  public Bus(Driver driver, Engine engine) {
    super(driver, engine);
  }

  @Override
  public void openDoor() {}

  @Override
  public void closeDoor() {}

  public Bus(Driver driver, Engine engine, Route route) {
    super(driver, engine);
    this.route = route;
  }
}
