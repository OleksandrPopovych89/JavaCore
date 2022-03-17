package lesson12.examples.example3;

public class Run2 implements Runnable {
    @Override
    public void run() {
        synchronized (Appl.class) {
            for (int i = 0; i < 10000; i++) {
                Appl.sum++;
            }
            System.out.println("Thread 2 is finished work.");
            System.out.println(Appl.sum);
        }
    }
}