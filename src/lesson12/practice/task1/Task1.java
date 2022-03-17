/**
Practical task.
Task 1:

Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).
 */

package lesson12.practice.task1;

public class Task1 {
    public static void main(String[] args) {

        TextPrinter textPrinter = new TextPrinter("I study Java", 1000, 10);
        textPrinter.Print();
    }
}