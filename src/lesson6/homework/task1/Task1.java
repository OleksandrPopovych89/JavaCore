/*
Homework task.
Task 1.

Develop abstract class Bird with attributes feathers and layEggs and an abstract method fly().
Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
Create array Bird and add different birds to it.
Call fly() method for all of it.
Output the information about each type of created bird.
 */
package lesson6.homework.task1;

public class Task1 {
    public static void main(String[] args) {

        Bird[] birds = new Bird[]{
                new Eagle("Feathers", "2-3"),
                new Swallow("Feathers", "4-5"),
                new Penguin("Featherless", "1-2"),
                new Chicken("Feathers", "15-30"),
        };

        flyToAll(birds);
        outputAllInfo(birds);
    }

    private static void outputAllInfo(Bird[] birds) {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    private static void flyToAll(Bird[] birds) {
        for (Bird bird : birds) {
            bird.fly();
        }
    }
}
