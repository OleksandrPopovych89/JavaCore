/*
Practical task.
Task 1.

Create interface Animal with methods voice() and feed(). Create two classes Cat and Dog, which implement this interface.
Create array of Animal and add some Cats and Dogs to it. Call voice() and feed() method for all of it.

 */
package lesson7.practice.task1;

public class Task1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat(),
                new Dog(),
                new Cat(),
                new Dog(),
        };

        callAllAnimals(animals);
    }

    private static void callAllAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}
