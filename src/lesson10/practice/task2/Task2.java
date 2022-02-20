/*

Practical task.
Task 2.

Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
- surnames and initials
- name
- name, middle name and last name.
 */
package lesson10.practice.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter surname, name and patronymic: ");
        String fullName = reader.readLine();

        String[] partName = fullName.split(" ");

        System.out.printf("%s %c.%c. \n", partName[0], partName[1].charAt(0), partName[2].charAt(0));
        System.out.println(partName[1]);
        System.out.printf("%s %s %s", partName[0], partName[1], partName[2]);
    }
}
