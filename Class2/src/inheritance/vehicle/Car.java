package inheritance.vehicle;

import inheritance.person.Driver;

public class Car extends Vehicle {

  public Car(Driver driver, Engine engine) {
    super(driver, engine);
  }

  @Override
  public void openDoor() {}

  @Override
  public void closeDoor() {}
}
