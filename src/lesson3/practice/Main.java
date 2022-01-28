/*
Create Console Application project in Java.
Add class Employee to the project.
Class Employee should consist of
	* three private fields: name, rate and hours;
	* static field totalSum
	* properties for access to these fields;
	* default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
	* methods:
* getSalary() - to calculate the salary of person (rate * hours)
* toString() - to output information about employee
* changeRate(int rate) - to change the rate of some employee and recalculate his salary
* getBonuses() – to calculate 10% from salary
In the method main() create 3 objects of Employee type. Input information about them.
Display the total salary of all workers to screen
 */
package lesson3.practice;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Serge");
        emp1.setRate(220);
        emp1.setHours(150);

        Employee emp2 = new Employee("Victor", 200);
        emp1.setHours(176);

        Employee emp3 = new Employee("Alex", 240, 160);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println();

        System.out.println(emp1.getName() + "`s salary is " + emp1.getSalary() + "₴.");
        System.out.println(emp2.getName() + "`s salary is " + emp2.getSalary() + "₴.");
        System.out.println(emp3.getName() + "`s salary is " + emp3.getSalary() + "₴.");
        System.out.println();
        System.out.println("New " + emp3.getName() + "`s salary is " + emp3.changeRate(260) + "₴.");
        System.out.println(emp3.getName() + "`s bonus is " + emp3.getBonuses() + "₴ (10% of salary).");


        Employee.setTotalSum(emp1, emp2, emp3);
        System.out.println();
        System.out.println("Total sum of employees salary's is " + Employee.getTotalSum() + "₴.");
    }
}
