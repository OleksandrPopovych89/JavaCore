package lesson12.practice.task2Implement;

public class PrintThread implements Runnable {
    private String text;
    private int pause;

    public PrintThread(String text, int pause) {
        this.text = text;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(text);
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}