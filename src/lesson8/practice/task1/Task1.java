/*
Practical task.
Task 1.

Suppose we have the class Car.
Create public inner class CarBuilder inside of Car class correspond to the next class diagram.
Create a car with four different parameters and print info about this car and its parameters
 */
package lesson8.practice.task1;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = Car.getCar().addColor("Blue").addModel("BMW").build();
        System.out.println(car1);

    }
}
