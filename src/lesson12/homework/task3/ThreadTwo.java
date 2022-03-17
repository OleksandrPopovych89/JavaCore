package lesson12.homework.task3;

public class ThreadTwo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number two");
        }
        ThreadThree threadThree = new ThreadThree();
        threadThree.start();
    }
}
