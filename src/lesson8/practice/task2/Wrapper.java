package lesson8.practice.task2;

public class Wrapper<T extends Shape> {
    private T t;

    public Wrapper(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Wrap{" +
                "t=" + t +
                '}';
    }
}
