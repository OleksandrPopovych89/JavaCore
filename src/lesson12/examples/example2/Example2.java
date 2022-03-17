package lesson12.examples.example2;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(123);
        Thread t1 = new MyThread(1, 100);
        Thread t2 = new MyThread(2, 250);
        t1.start();
        t2.start();

//        t1.run();
//        t2.run();

//        t1.join();
//        t2.join();
        System.out.println("Thread main");
    }
}
