package lesson12.examples.example4;

public class DeadlockDemo {
    public final static Object first = new Object();
    public final static Object second = new Object();

    public static void main(String[] s) {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (first) {
                    Thread.yield();
                    synchronized (second) {
                        System.out.println("Success 1!");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (second) {
                    Thread.yield();
                    synchronized (first) {
                        System.out.println("Success 2!");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}