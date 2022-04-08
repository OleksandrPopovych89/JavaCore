/**
 * In method main() create menu for resolve next tasks.
 * Realize input/output on console and in a file.
 * Each task should be write in separate file with name TaskN.java
 * <p>
 * 2.Input number and decompose this number into a product
 * of prime numbers with their degrees (e.g. number: 84, result 2^2, 3, 7)
 */
package lesson15.practice.task2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {

        int num = 0;
        StringBuilder stringBuilder = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            stringBuilder = new StringBuilder();
            System.out.print("Enter the number: ");
            num = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


        writeToFile(stringBuilder.toString(), "src/lesson15/practicaltasks/task1/Task2.java.txt");
    }

    public static void writeToFile(String str, String name) {

        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(name, false);
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
