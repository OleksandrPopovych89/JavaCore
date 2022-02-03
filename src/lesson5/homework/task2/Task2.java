/*
Homework task.
Task 2.

Enter 10 integer numbers.
Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
 */
package lesson5.homework.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {

        int[] numbers = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + " number of 10: ");
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println(calculateSumOfArrayElements(numbers));
    }

    private static int calculateSumOfArrayElements(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            sum += numbers[i];
            if (numbers[i] > 0) {
            } else {
                sum = 0;
                for (int j = 4; j < 9; j++) {
                    sum += numbers[j];
                }
                return sum;
            }
        }
        return sum;
    }
}