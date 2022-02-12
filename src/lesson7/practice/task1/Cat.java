package lesson7.practice.task1;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow-meow.");
    }

    @Override
    public void feed() {
        System.out.println("Eat fish adn cat-food.");
    }
}
