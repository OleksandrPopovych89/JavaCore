package lesson12.homework.task1;

public class Message implements Runnable {
    private final String text;

    public Message(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(text);
        }
    }
}
