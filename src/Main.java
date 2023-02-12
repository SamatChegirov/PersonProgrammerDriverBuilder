import person.Builder;
import person.Driver;
import person.Person;
import person.Programmer;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Hacker", 0);
        Person.setAge(19);
        System.out.println(programmer + "\n" + programmer.working() + "\nAge: " + Person.getAge(0));
        System.out.println(" ");
        Driver driver = new Driver("Boba", 0);
        Person.setAge(65);
        System.out.println(driver + "\n" + driver.working() + "\nAge: " + Person.getAge(0));
        System.out.println(" ");
        Builder builder = new Builder("Tom", 0);
        Person.setAge(45);
        System.out.println(builder + "\n" + builder.working() + "\nAge: " + Person.getAge(0));


    }
}