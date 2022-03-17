package lesson12.homework.task3;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        System.out.println("Thread number one");
        ThreadTwo threadTwo = new ThreadTwo();
        threadTwo.run();
    }
}
