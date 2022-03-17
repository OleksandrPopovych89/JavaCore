/**
 * Homework task.
 * Task 2:
 * <p>
 * Cause a deadlock.
 * Organize the expectations of ending a thread in main(), and make the end of the method main() in this thread.
 */

package lesson12.homework.task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Main thread is run");
        Thread thread = new Thread() {
            public void run() {
                System.out.println("Thread is run");
            }
        };

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is end");
    }
}