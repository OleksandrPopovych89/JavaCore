package lesson7.practice.task2;

public class Student extends Person {
    private final String TYPE_PERSON;

    public Student(String name, String TYPE_PERSON) {
        super(name);
        this.TYPE_PERSON = TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("I am a student.");
    }

}
