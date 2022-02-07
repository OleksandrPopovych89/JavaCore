package lesson6.practice.task1;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfManufacture) {
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
//        return "Truck{" +
//                "model='" + getModel() + '\'' +
//                ", maxSpeed=" + getMaxSpeed() +
//                ", yearOfManufacture=" + getYearOfManufacture() +
//                '}';
//    }
}
