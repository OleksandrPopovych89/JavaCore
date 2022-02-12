package lesson7.practice.task2;

public class Cleaner extends Staff {
    private final String TYPE_PERSON;

    public Cleaner(String name, String TYPE_PERSON) {
        super(name);
        this.TYPE_PERSON = TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner.");
    }

    @Override
    public void salary() {
        System.out.println("I get salary.");
    }
}
