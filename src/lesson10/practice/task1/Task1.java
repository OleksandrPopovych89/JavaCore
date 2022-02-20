/*
Practical task.
Task 1.

Enter the two variables of type String. Determine whether the first variable substring second.
For example, if you typed «IT» and «IT Academy» you must receive true.
 */
package lesson10.practice.task1;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "IT";
        String str2 = "IT Academy";

        Boolean b = str2.contains(str1);
        System.out.println(b);
    }
}
