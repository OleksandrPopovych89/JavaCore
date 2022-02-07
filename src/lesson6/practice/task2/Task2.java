/*
Practical task.
Task 1.

Create three classes:
- Point with attributes x and y
- Line which contains two object of Point class
- ColorLine with attributes Color  which extends Line class.
Override method toString() and define method print() in every classes
In main() method create array of Line and add some Line and ColorLine to it. Call method print() for all of it.
 */
package lesson6.practice.task2;

public class Task2 {
    public static void main(String[] args) {


        Line[] lineArr = new Line[]
                {new Line(new Point(10, 20), new Point(15, 16)),
                        new ColorLine(new Point(15, 16), new Point(20, 25), "Red"),
                        new ColorLine(new Point(15, 16), new Point(20, 25), "Blue")};

        printArray(lineArr);
    }

    private static void printArray(Line[] lineArr) {
        for (Line line : lineArr) {
            System.out.println(line);
        }
    }
}
