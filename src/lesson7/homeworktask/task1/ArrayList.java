package lesson7.homeworktask.task1;

import java.util.*;

public class ArrayList {

    public static void runArrayList() {
        List<Employee> employees = new java.util.ArrayList<>();
        employees.add(new ContractEmployee("0001007", "Alex", 32, "664455", 176, 15));
        employees.add(new SalariedEmployee("00022007", "Mike", 28, "334455", 1800));
        employees.add(new ContractEmployee("00033007", "Jack", 25, "554455", 146, 10));
        employees.add(new SalariedEmployee("00055007", "John", 46, "228855", 1600));


        System.out.println("Array list before sorting:");
        printAllEmployees(employees);

        System.out.println("Array list list after sorting:");
        arrayListSortToSalary(employees);
        printAllEmployees(employees);

    }


    private static void arrayListSortToSalary(List<Employee> employees) {
        employees.sort(new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
    }

    private static void printAllEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}