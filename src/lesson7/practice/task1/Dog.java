package lesson7.practice.task1;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof-woof.");
    }

    @Override
    public void feed() {
        System.out.println("Eat bones adn dog-food.");
    }
}
