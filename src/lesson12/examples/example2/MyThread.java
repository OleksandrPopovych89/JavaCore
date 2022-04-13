package lesson12.examples.example2;

public class MyThread extends Thread {
    private int number;
    private int pause;

    public MyThread(int number, int pause) {
        this.number = number;
        this.pause = pause;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
            System.out.println("Thread " + number);
        }
    }
}