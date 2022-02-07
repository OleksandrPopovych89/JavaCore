package lesson6.homework.task2;

public class Developer extends Employee {

    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Position: %s, Age: %d, Salary : \u20b4 %.2f.",
                getName(), getPosition(), getAge(), getSalary());
    }
}