package lesson7.homeworktask.task1;

public class ContractEmployee extends Employee implements Payment {

    private final String federalTaxIdMember;
    private int numberOfHoursWorked;
    private int hourlyRate;

    public ContractEmployee(String employeeId, String name, int age, String federalTaxIdMember,
                            int numberOfHoursWorked, int hourlyRate) {
        super(employeeId, name, age);
        this.federalTaxIdMember = federalTaxIdMember;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
        calculatePay();
    }


    @Override
    public int calculatePay() {
        setSalary(hourlyRate * numberOfHoursWorked);
        return getSalary();
    }
}