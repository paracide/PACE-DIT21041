package polymorphism;

public class Train extends Vehicle {
  public Train(String brand, int year, String vin) {
    super(brand, year, vin);
  }

  @Override
  public void drive() {
    System.out.println("G22");
  }

  @Override
  public void hook() {
    System.out.println("Wula");
  }
}
