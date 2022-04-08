/**
 * In method main() create menu for resolve next tasks.
 * Realize input/output on console and in a file.
 * Each task should be write in separate file with name TaskN.java
 *
 * 1.Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)
 */
package lesson15.practice.task1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
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
        if (num <= 1 & num >= 0) {
            stringBuilder.append(num);
            System.out.print(num);
        } else if (num >= 1) {
            int n0 = 1;
            int n1 = 1;
            stringBuilder.append(n0 + " " + n1 + " ");
            System.out.print(n0 + " " + n1 + " ");
            int n2;
            for (int i = 3; i < num; i++) {
                n2 = n0 + n1;
                stringBuilder.append(n2 + " ");
                System.out.print(n2 + " ");
                n0 = n1;
                n1 = n2;
            }
        } else {
            System.out.println("You enter negative number.");
        }
        writeToFile(stringBuilder.toString(), "src/lesson15/practicaltasks/task1/Task1.java.txt");
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
