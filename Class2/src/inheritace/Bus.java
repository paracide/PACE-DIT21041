package inheritace;

public class Bus extends Vehicle {
  private Door door;
  private Route route;

  public Bus(Driver driver, Engine engine) {
    super(driver, engine);
  }

  public Bus(Driver driver, Engine engine, Route route) {
    super(driver, engine);
    this.route = route;
  }

  public void openDoor() {}

  public void closeDoor() {}

}
