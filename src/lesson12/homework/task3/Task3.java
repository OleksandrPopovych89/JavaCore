/**
Homework task.
Task 3:

Create a thread «one», which would start the thread «two»,
which has to output its number («Thread number two») 3 times and create thread «three»,
which would to output message «Thread number three» 5 times.
 */

package lesson12.homework.task3;

public class Task3 {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
    }
}