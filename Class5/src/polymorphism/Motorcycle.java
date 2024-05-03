package polymorphism;

public class Motorcycle extends Vehicle {

  public Motorcycle(String brand, int year, String vin) {
    super(brand, year, vin);
  }

  @Override
  public void drive() {
    System.out.println("你很机车耶");
  }
}
