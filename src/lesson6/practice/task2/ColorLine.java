package lesson6.practice.task2;

public class ColorLine extends Line {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" + super.toString() +
                "color='" + color + '\'' +
                '}';
    }
}
