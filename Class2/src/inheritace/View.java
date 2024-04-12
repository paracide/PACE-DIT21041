package inheritace;

public class View {
  public static void main(String[] args) {
    Driver arthur = new Driver("Arthur", 12);
    Engine ford = new Engine();
    Route route11 = new Route(11);

    Bus bus11 = new Bus(arthur, ford, route11);
    bus11.stop();
    bus11.start();
    bus11.moveForward();
    bus11.breakFullStop();
    ;
    System.out.println(bus11.getVehicleState());
  }
}
