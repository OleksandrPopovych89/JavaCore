/*
Practical task.
Task 2.

Suppose we have the next diagram.
Create Wrapper class which should wrap any objects which implements Shape interface
For example/
 */
package lesson8.practice.task2;

public class Task2 {
    public static void main(String[] args) {

        Wrapper<Shape> squareWrapper = new Wrapper<>(new Square(1, 2));
        Wrapper<Shape> circleWrapper = new Wrapper<>(new Circle(2));

        /* Line can`t compile cause not implement interface Shape
         Wrapper<String> stringWrapper = new Wrapper<>("Hello");
         */

        System.out.println(squareWrapper);
        System.out.println(circleWrapper);

        /* Line can`t compile cause not implement interface Shape
        System.out.println(stringWrapper);
        */
    }
}
