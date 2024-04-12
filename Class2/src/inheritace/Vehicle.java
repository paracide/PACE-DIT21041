package inheritace;

public class Vehicle {
  private int wheels;
  private int capacity;
  private String fuelType;
  private Driver driver;
  private Engine engine;
  private VehicleState vehicleState = VehicleState.breakFullStop;

  public Vehicle(Driver driver, Engine engine) {
    this.driver = driver;
    this.engine = engine;
  }

  public void start() {
    engine.powerOn();
  }

  public void stop() {
    engine.powerOff();
  }

  public void moveForward() {
    if (engine.isRunning()) {
      vehicleState =VehicleState.forward;
    }
  }

  public void moveBackward() {
    if (engine.isRunning()) {
      vehicleState =VehicleState.backward;
    }
  }

  public void breakBus() {
    vehicleState =VehicleState.breakFullStop;
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public String getFuelType() {
    return fuelType;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public VehicleState getVehicleState() {
    return vehicleState;
  }

  public void setVehicleState(VehicleState vehicleState) {
    this.vehicleState = vehicleState;
  }
}
