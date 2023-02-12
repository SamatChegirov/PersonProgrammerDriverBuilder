package person;

public class Driver extends Person {
    public Driver(String name, int i) {
        super(name);
    }

    @Override
    public String working() {
        return "Drive a car.";
    }
}
