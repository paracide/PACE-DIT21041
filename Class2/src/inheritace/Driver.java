package inheritace;

public class Driver extends Person {
    public Driver(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return "I am the driver: "+super.getName();
    }
}
