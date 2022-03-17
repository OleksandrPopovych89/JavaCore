/**
Practical task.
Task 2(extend Thread):

Output two messages «Hello, world» and «Peace in the peace» 5 times each with the intervals of 2 seconds,
and the second - 3 seconds. After printing messages, print the text «My name is …»
 */
package lesson12.practice.task2extend;

public class Task2Extend {
    public static void main(String[] args) {
        PrintThread thread1 = new PrintThread("Hello, world!", 2000);
        PrintThread thread2 = new PrintThread("Peace in the peace!", 3000);

        thread1.start();
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My name is Alex.");
    }
}