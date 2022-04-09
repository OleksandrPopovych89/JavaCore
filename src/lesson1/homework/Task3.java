/**
Create console application. In method main() write code for solving next tasks:

3) Phone calls from three different countries are с1, с2 and с3 standard units per minute.
Talks continued t1, t2 and t3 minutes.
How much computer will count for each call separately and all talk together?
Input all source data from console, make calculations and output to the screen.
 */

package lesson1.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) {

        Calculate();
    }

    public static void Calculate() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter c1 cost per minute:");
            double c1 = Double.parseDouble(reader.readLine());
            System.out.print("Enter c2 cost per minute:");
            double c2 = Double.parseDouble(reader.readLine());
            System.out.print("Enter c3 cost per minute:");
            double c3 = Double.parseDouble(reader.readLine());
            System.out.print("Enter duration of calls from c1:");

            double durationC1 = Double.parseDouble(reader.readLine());
            System.out.print("Enter duration of calls from c2:");
            double durationC2 = Double.parseDouble(reader.readLine());
            System.out.print("Enter duration of calls from c3:");
            double durationC3 = Double.parseDouble(reader.readLine());
            System.out.println("Call cost from c1 is " + c1 * durationC1 + " units.");
            System.out.println("Call cost from c2 is " + c2 * durationC2 + " units.");
            System.out.println("Call cost from c3 is " + c3 * durationC3 + " units.");

            System.out.println("Call cost from all calls is " +
                    (c1 * durationC1 + c2 * durationC2 + c3 * durationC3) + " units.");
        } catch (Exception e) {
            System.err.println(e + "\nPlease try again!");
            Calculate();
        }
    }
}