package lesson8.homework.task1;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFistName() + ", Las name: " + fullName.getLastName() +
                ", Age: " + age;
    }

    public abstract String activity();
}
