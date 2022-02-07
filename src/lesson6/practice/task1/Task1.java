/*
Practical task.
Task 1.

Create abstract class Car with model, maxSpeed and yearOfManufacture properties and run() and stop() methods.
Develop classes Truck and Sedan which extend class Car.
In main method create array of Car’s objects. Add to this array some trucks and sedans and print info about it.
 */
package lesson6.practice.task1;

public class Task1 {
    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Truck("Mercedes Sprinter ", 140, 2015),
                new Truck("Hyundai HD78 ", 125, 2020),
                new Sedan("Hyundai Sonata", 210, 2017),
                new Sedan("Toyota Camry", 210, 2019),
        };

        printCars(cars);
    }

    private static void printCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
