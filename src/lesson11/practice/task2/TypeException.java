package lesson11.practice.task2;

public class TypeException extends Exception {
    public TypeException(String msg) {
        super(msg + "\n");
    }
}
