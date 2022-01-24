/*
Create console application. In method main() write code for solving next tasks:

2) Define String variables name and address. Output question "What is your name?"
Read the value name and output next question: “Where are you live, (name)?".
 Read address and write whole information.
 */

package lesson1.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = reader.readLine();
        System.out.println("Where are you live, " + name + "?");
        String address = reader.readLine();

        System.out.println(name + " live in " + address + ".");
    }
}
