package lesson5.homework.task1;

public class Month {
    private String nameMonth;
    private int numberMonth;
    private int days;

    public Month(String nameMonth, int numberMonth, int days) {
        this.nameMonth = nameMonth;
        this.numberMonth = numberMonth;
        this.days = days;
    }

    public String getNameMonth() {
        return nameMonth;
    }

    public int getNumberMonth() {
        return numberMonth;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "Month{" +
                "nameMonth='" + nameMonth + '\'' +
                ", numberMonth=" + numberMonth +
                ", days=" + days +
                '}';
    }
}
