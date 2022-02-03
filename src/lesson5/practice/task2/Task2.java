/*
Practical task.
Task 2

Create a class Employee with fields name, department number, salary.
Create five objects of class Employee.
Display:
- all employees of a certain department (enter department number in the console);
- arrange workers by the field salary in descending order.
 */
package lesson5.practice.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {

        Employee[] employees = new Employee[]{
                new Employee("Alex", 1, 2100.7),
                new Employee("Egor", 1, 1900.5),
                new Employee("Victor", 2, 1600.4),
                new Employee("Olena", 2, 1750.1),
                new Employee("Svitlana", 3, 2000.5)};


        toDisplayNamesForDepartmentNumber(employees);
        toSortForSalary(employees);
        displayNames(employees);

    }

    private static void displayNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    private static void toSortForSalary(Employee[] employees) {
        System.out.println("Names workers by the field salary in descending order: ");
        Employee temp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }

    private static void toDisplayNamesForDepartmentNumber(Employee[] employees) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter employee department number: ");
        int dep = Integer.parseInt(reader.readLine());
        System.out.println("In department " + dep + " working: ");
        for (Employee emp : employees) {
            if (emp.getDepartmentNumber() == dep) {
                System.out.println(emp.getName());
            }
        }
        System.out.println();
    }
}
