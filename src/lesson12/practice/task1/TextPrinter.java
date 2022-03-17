package lesson12.practice.task1;

public class TextPrinter {
    private String text;
    private int pause;
    private int number;

    public TextPrinter(String text, int pause, int number) {
        this.text = text;
        this.pause = pause;
        this.number = number;
    }

    public void Print() {

        for (int i = 0; i < this.number; i++) {
            System.out.println(this.text);
            try {
                Thread.sleep(this.pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
