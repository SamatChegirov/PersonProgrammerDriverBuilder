package person;

public class Programmer extends Person {

    public Programmer(String name, int i) {
        super(name);
    }

    @Override
    public String working() {
        return "Write code.";
    }
}
