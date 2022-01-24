/*
Create Console Application project in Java.
In method main() write code for solving next tasks:

Define integer variables a and b. Read values a and b from Console and calculate:
a + b
a - b
a * b
a / b.
Output obtained results.

 */
package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Enter b: ");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (double) a / (double) b);
    }
}
