/**
Practical task.
Task 2(implement Runnable):

Output two messages «Hello, world» and «Peace in the peace» 5 times each with the intervals of 2 seconds,
and the second - 3 seconds. After printing messages, print the text «My name is …»
 */
package lesson12.practice.task2Implement;

public class Task2Implement {
    public static void main(String[] args) {
        Runnable r1 = new PrintThread("Hello, world!", 2000);
        Thread t1 = new Thread(r1);

        Runnable r2 = new PrintThread("Peace of the peace", 3000);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My name is Alex.");
    }
}