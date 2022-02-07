/*
Homework task.
Task 2.

Support we have a class Employee.
Create a Developer class that extends the Employee class.
Creates a String field and a constructor to initialize all fields in the Developer class.

Also in the Developer class, override the method report() so that it returns a string
with information about the developer, for example:
Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
If necessary, modify the employee's class so that it meets the principles of encapsulation and inheritance.
Create an instance of the Employee and Developer class and print
in the console information about them using report() method.
 */
package lesson6.homework.task2;

public class Task2 {
    public static void main(String[] args) {

        Developer developer = new Developer
                ("Taras", 32, 32735.35, "Average Java developer");

        System.out.print(developer.report());
    }
}
