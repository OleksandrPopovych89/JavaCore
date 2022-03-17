/**
Homework task.
Task 1:

Run three threads and output there different messages for 5 times.
The third thread supposed to start after finishing working of the two previous threads.
 */

package lesson12.homework.task1;

public class Task1 {
    public static void main(String[] args) {

        Message message1 = new Message("Hello!");
        Message message2 = new Message("Hi!");
        Message message3 = new Message("Bye bye!");

        Runnable r1 = message1;
        Runnable r2 = message2;
        Runnable r3 = message3;

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        Thread thread3 = new Thread(r3);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();

    }
}