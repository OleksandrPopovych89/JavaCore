package lesson11.practice.task2;

public class ColorException extends Exception {
    public ColorException(String msg) {
        super(msg + "\n");
    }
}
