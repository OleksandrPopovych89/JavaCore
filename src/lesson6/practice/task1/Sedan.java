package lesson6.practice.task1;

public class Sedan extends Car {


    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println(getModel() + " is running.");
    }

    @Override
    public void stop() {
        System.out.println(getModel() + " is stopping.");
    }

//    @Override
//    public String toString() {
//        return "Sedan{" +
//                "model='" + getModel() + '\'' +
//                ", maxSpeed=" + getMaxSpeed() +
//                ", yearOfManufacture=" + getYearOfManufacture() +
//                '}';
//    }
}
