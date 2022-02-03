/*
Homework task.
Task 3, subtask 2.

Organize entering integers until the first negative number.
Count the product of all entered even numbers.
 */
package lesson5.homework.task3.subtask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subtask2 {
    public static void main(String[] args) throws IOException {


        int[] arr = new int[5];

        fillArray(arr);

    }

    private static void fillArray(int[] arr) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int temp;
        for (int i = 0; ; i++) {
            if (arr.length == i) {
                arr = increaseTheSize(arr);
            }
            System.out.print("Enter " + (i + 1) + " number: ");
            temp = Integer.parseInt(reader.readLine());
            if (temp >= 0) {
                arr[i] = temp;
            } else {
                productOfAllEvenNumbers(arr);
                break;
            }
        }
    }

    private static int[] increaseTheSize(int[] arr) {
        int[] temp = new int[(int) (arr.length * 1.8)];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        return temp;
    }

    private static void productOfAllEvenNumbers(int[] arr) {
        long count = 1;
        for (int i : arr) {
            if (i == 0 || i % 2 != 0) continue;
            count *= i;
        }
        System.out.println(count);
    }
}
