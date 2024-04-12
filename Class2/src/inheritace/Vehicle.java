package inheritace;

public abstract class Vehicle {
  private int wheels;
  private int capacity;
  private String fuelType;
  private Driver driver;
  private Engine engine;
  private VehicleState vehicleState;

  public Vehicle(Driver driver, Engine engine) {
    this.driver = driver;
    this.engine = engine;
  }


  public void start() {
    engine.powerOn();
  }

  public void stop() {
    breakFullStop();
    engine.powerOff();
  }

  public void moveForward() {
    if (engine.isRunning()) {
      vehicleState = new VehicleStateMovingForward();
    }
  }

  public void moveBackward() {
    if (engine.isRunning()) {
      vehicleState = new VehicleStateMovingBackward();
    }
  }

  public void breakFullStop() {
    vehicleState = new VehicleStateFullStop();
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
