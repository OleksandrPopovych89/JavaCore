/*
Homework task.

Create method div(), which calculates the dividing of two double numbers.
In main method input 2 double numbers and call this method. Catch all exceptions.
Write a method readNumber(int start, int end), that read from console integer number and return it,
if it is in the range [start...end].
If an invalid number or non-number text is read, the method should throw an exception.
Using this method write a method main(), that has to enter 10 numbers:
	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
Refactor your previous homework (1-7) and try to handle all possible exceptions in your code.
 */
package lesson11.homework;

public class Task {
    public static void main(String[] args) {
        char a = 2;
        try {
            double div = div(a, 4);
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }

    }

    public static double div(double a, double b) {
        if (b == 0)
            throw new ArithmeticException();
        return a / b;
    }
}
