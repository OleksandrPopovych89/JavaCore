/*
Practical task.
Task 1

Create an array of ten integers.
Display:
- the biggest of these numbers;
- the sum of positive numbers in the array;
- the amount of negative numbers in the array.
What values there are more: negative or positive?
 */
package lesson5.practice.task1;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, -10, -22, -44, -5, -2};

        System.out.println(getMax(arr));
        System.out.println(getSumOfPositiveValue(arr));
        System.out.println(getNegativeAmount(arr));
        System.out.println(findTheMajority(arr));

    }

    private static String findTheMajority(int[] arr) {
        if (getNegativeAmount(arr) > getPositiveAmount(arr)) {
            return "Negative numbers more than positive.";
        } else if (getNegativeAmount(arr) < getPositiveAmount(arr)) {
            return "Positive numbers more than negative.";
        } else {
            return "Equal of positive and negative numbers.";
        }
    }

    private static int getNegativeAmount(int[] arr) {
        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) amount++;
        }
        return amount;
    }

    private static int getPositiveAmount(int[] arr) {
        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) amount++;
        }
        return amount;
    }


    private static int getSumOfPositiveValue(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) sum += arr[i];
        }
        return sum;
    }

    private static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
}
