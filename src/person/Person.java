package person;
/*        InteliJ IDEA'дан жаңы проект ачыңыз.
        src деген пакеттин ичине жаңы person деген пакет ачыңыз.
        person пакеттин ичине Person, Programmer, Driver, Builder деген класс түзүңүз.
        Person класстын ичине private final name, private static age деген поля кошуп,
        working() деген метод түзүңүз. Баардык класстар Person классын мурастасын.
        Main класстан бирден объектерин түзүп, аргументтерин берип,
        Person класстын working() методдун override кылып, өзүнө тиешелүү жумуштарын консольго чыгарыңыз*/

public class Person {
    private final String name;
    private static int age;


    public Person(String name) {
        this.name = name;
    }

    public String working() {
        return "";
    }

    public String getName() {
        return name;
    }

    public static int getAge(int age) {
        return Person.age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    @Override
    public String toString() {
        return "Person " + "name: " + name + ",";
    }
}
