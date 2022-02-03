/*
Homework task.
Task 3, subtask 1.

Enter 5 integer numbers.
Find:
- position of second positive number;
- minimum and its position in the array.
 */
package lesson5.homework.task3.subtask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subtask1 {
    public static void main(String[] args) throws IOException {

        int[] arr = new int[5];

        fillArray(arr);
        findPositionOfSecondPositiveNumber(arr);
        findMinimumAndItsPosition(arr);
    }

    private static void fillArray(int[] arr) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " number of " + arr.length + ": ");
            arr[i] = Integer.parseInt(reader.readLine());
        }
    }

    private static void findPositionOfSecondPositiveNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("Position of the second positive number is: " + (i + 1) + ".");
                break;
            }
        }
    }

    private static void findMinimumAndItsPosition(int[] arr) {
        int min = arr[0];
        int position = 1;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                position = (i + 1);
            }
        }
        System.out.println("The minimum value of " + min + " is element position " + position + ".");
    }
}
