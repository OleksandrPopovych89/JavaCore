/*
Practical task.
Task 2.

Create a class Plant, which includes fields int size, Color color and Type type,
and constructor where these fields are initialized. Color and type are Enum.
Override the method toString( ).
Create classes ColorException and TypeException and describe there all possible colors and types of plants.
In the method main create an array of five plants. Check to work your exceptions.
 */
package lesson11.practice.task2;

public class Task2 {
    public static void main(String[] args) {

        Plant[] garden = new Plant[5];

        try {
            garden[0] = new Plant("grass", "red", 5);
            System.out.println(garden[0]);

            garden[1] = new Plant("grassssss", "red", 8);
            System.out.println(garden[1]);

            garden[2] = new Plant("grass", "redddd", 4);
            System.out.println(garden[2]);

            garden[3] = new Plant("grass", "redddd", 1);
            System.out.println(garden[3]);

            garden[4] = new Plant("grassss", "redddd", 3);
            System.out.println(garden[4]);

            garden[5] = new Plant("tree", "white", 2);
            System.out.println(garden[5]);

        } catch (ColorException | TypeException e) {
            System.err.println(e);
        }
    }
}
