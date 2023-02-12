package person;

public class Builder extends Person {
    public Builder(String name, int i) {
        super(name);
    }

    @Override
    public String working() {
        return "Builder build houses.";
    }
}
