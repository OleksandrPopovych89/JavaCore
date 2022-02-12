package lesson7.homeworktask.task1;

public class SalariedEmployee extends Employee implements Payment {
    private final String socialSecurityNumber;
    private int fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, int age, String socialSecurityNumber, int fixedMonthlyPayment) {
        super(employeeId, name, age);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        calculatePay();
    }

    @Override
    public int calculatePay() {
        setSalary(fixedMonthlyPayment);
        return getSalary();
    }
}