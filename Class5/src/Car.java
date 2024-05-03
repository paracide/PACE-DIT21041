public class Car extends Vehicle {
  private int numberOfDoors;

  public Car(String brand, int year, String vin, int numberOfDoors) {
    super(brand, year, vin);
    this.numberOfDoors = numberOfDoors;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }
}
