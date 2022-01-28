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

public class Employee {
    private static double totalSum;
    private String name;
    private double rate;
    private int hours;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static void setTotalSum(Employee... employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        totalSum = sum;
    }

    public double getSalary() {
        return this.rate * this.hours;
    }


    @Override
    public String toString() {
        return "Employee " + name + " has rate " + rate + "₴ per hour and worked " + hours + " hours.";
    }

    public double changeRate(double newRate) {
        setRate(newRate);
        return getSalary();
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }
}
