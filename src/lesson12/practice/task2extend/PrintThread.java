package lesson12.practice.task2extend;

public class PrintThread extends Thread {
    private String tex;
    private int pause;

    public PrintThread(String tex, int pause) {
        this.tex = tex;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.tex);
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}