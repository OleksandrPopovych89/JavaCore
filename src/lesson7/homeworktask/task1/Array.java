package lesson7.homeworktask.task1;

import java.util.*;

public class Array {

    public static void runArray() {

        Employee[] employees = new Employee[]{
                new ContractEmployee("0001007", "Alex", 32, "664455", 176, 15),
                new SalariedEmployee("00022007", "Mike", 28, "334455", 1800),
                new ContractEmployee("00033007", "Jack", 25, "554455", 146, 10),
                new SalariedEmployee("00055007", "John", 46, "228855", 1600)
        };

        System.out.println("Array before sorting:");
        printAllEmployees(employees);

        System.out.println("Array after sorting:");
        arraySortToSalary(employees);
        printAllEmployees(employees);
    }

    private static void arraySortToSalary(Employee[] employees) {
        Arrays.sort(employees, new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
    }

    private static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}