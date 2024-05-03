package polymorphism;

public class Bus extends Vehicle {
  public Bus(String brand, int year, String vin) {
    super(brand, year, vin);
  }

  @Override
  public void drive() {
    System.out.println("Free bus");
  }

  @Override
  public void hook() {
    System.out.println("Didu");
  }
}
