package lesson7.homeworktask.task1;

public class Employee {
    private String employeeId;
    private String name;
    private int age;
    private int salary;

    public Employee(String employeeId, String name, int age) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String report() {
        return ("Id: " + getEmployeeId() + ", name: " + getName() + ", salary: $" + getSalary());
    }

}
