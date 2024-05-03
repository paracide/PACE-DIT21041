package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ViewVehicle {

  public static void main(String[] args) {
    Car audi = new Car("Audi", 2023, "123", 4);
    Bus bmw = new Bus("BMW", 2021, "123");
    Motorcycle ofo = new Motorcycle("OFO", 2011, "123");
    Train byd = new Train("BYD", 2024, "123");

    List<Vehicle> garage = new ArrayList<>();
    garage.add(audi);
    garage.add(bmw);
    garage.add(ofo);
    garage.add(byd);
    garage.forEach(Vehicle::drive);
  }
}
