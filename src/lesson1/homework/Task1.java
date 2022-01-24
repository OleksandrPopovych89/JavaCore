/*
Create console application. In method main() write code for solving next tasks:

1) Flower bed is shaped like a circle.
Calculate the perimeter and area by entering the radius.
Output obtained results.
 */

package lesson1.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter radius of circle in mm.: ");
        double radius = Double.parseDouble(reader.readLine());

        double perimeter = Math.round(2 * radius * Math.PI);
        double area = Math.round(Math.PI * Math.pow(radius, 2.0));

        System.out.println("This circle with a radius of " + radius + " mm.\nhas perimeter of "
                + perimeter + " mm. \nand an area " + area + " mm2.");
    }
}
