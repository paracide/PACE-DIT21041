package polymorphism;

public class ViewVehicle {

  public static void main(String[] args) {
    Car audi = new Car("Audi", 2023, "123", 4);
    Car audi2 = new Car("Audi", 2023, "123", 4);
    Car bmw = new Car("BMW", 2023, "123", 4);

    System.out.println(audi.equals(audi2));
  }
}
