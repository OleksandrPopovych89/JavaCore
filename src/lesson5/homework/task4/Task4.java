/*
Homework task.
Task 4.

Create class Car with fields type, year of production and engine capacity.
Create and initialize four instances of class Car.
Display cars:
- certain model year (enter year in the console);
- ordered by the field year.
 */
package lesson5.homework.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {

        Car[] cars = new Car[]{
                new Car("Sedan", 2017, 188),
                new Car("Hatchback", 2014, 140),
                new Car("Coupe", 2021, 330),
                new Car("Universal", 2015, 160),
        };

        findCarOfYear(cars);
        orderByYear(cars);
        System.out.println("Sorted cars of year:");
        printCars(cars);
    }

    private static void findCarOfYear(Car[] cars) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the searching year of cars production: ");
        int findYear = Integer.parseInt(reader.readLine());
        int count = 0;
        for (Car car : cars) {
            if (car.getYearOfProduction() == findYear) {
                System.out.println(car);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Car " + findYear + " year production is not find.");
        }
    }

    private static void orderByYear(Car[] cars) {
        Car temp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
    }

    private static void printCars(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
