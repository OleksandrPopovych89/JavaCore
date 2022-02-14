package lesson8.practice.task2;

public class Circle implements Shape {
    private double area;
    private double perimeter;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
