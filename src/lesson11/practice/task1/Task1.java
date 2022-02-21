/*
Practical task.
Task 1.

Create a method for calculating the area of rectangle
int squareRectangle (int a, int b),
which should throw an exception if the user enters negative value.
Input values a and b from console. Check the squareRectangle method in the method main.
Check to input non-numeric
 */

package lesson11.practice.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = reader.readLine();
            String[] sidesString = input.split(" ");
            int[] sides = {Integer.parseInt(sidesString[0]), Integer.parseInt(sidesString[1])};
            double area = squareRectangle(sides[0], sides[1]);
            System.out.println("Area is " + area);

        } catch (IOException e) {
            System.err.println("IO error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Size error");
        } catch (NumberFormatException e) {
            System.err.println("Not integer input");
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
    }

    static int squareRectangle(int a, int b) throws ArithmeticException {
        if (a <= 0 | b <= 0) {
            throw new ArithmeticException("Negative values");
        } else {
            return a * b;
        }
    }
}

