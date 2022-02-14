package lesson8.practice.task2;

public class Square implements Shape {
    private double area;
    private double perimeter;
    private double side1;
    private double side2;

    public Square(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return (side1 + side2) * 2;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
