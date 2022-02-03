/*
Homework task.
Task 1.

Ask user to enter the number of month.
Read the value and write the amount of days in this month (create array with amount days of each month).
*/
package lesson5.homework.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {

        Month[] months = new Month[]{
                new Month("January", 1, 31),
                new Month("February", 2, 28),
                new Month("March", 3, 31),
                new Month("April", 4, 30),
                new Month("May", 5, 31),
                new Month("June", 6, 30),
                new Month("July", 7, 31),
                new Month("August", 8, 31),
                new Month("September", 9, 30),
                new Month("October", 10, 31),
                new Month("November", 11, 30),
                new Month("Dismember", 12, 31),
        };

        getMonth(months);
    }

    private static void getMonth(Month[] months) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of mouth: ");
        int numberOfMonth = Integer.parseInt(reader.readLine());
        if (numberOfMonth < 1 || numberOfMonth > 12) {
            System.out.println("You entered " + numberOfMonth + " that outside the month number");
            getMonth(months);
        }
        for (Month month : months) {
            if (month.getNumberMonth() == numberOfMonth) {
                System.out.println(numberOfMonth + " month is " + month.getNameMonth() + " has " + month.getDays() + " days.");
            }
        }
    }
}
