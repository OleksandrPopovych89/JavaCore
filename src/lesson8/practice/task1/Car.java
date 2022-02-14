package lesson8.practice.task1;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dataOfProduction;
    private double engineCapacyty;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioner;

    public Car() {
    }

    public static CarBuilder getCar() {
        return new Car().new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dataOfProduction=" + dataOfProduction +
                ", engineCapacyty=" + engineCapacyty +
                ", color='" + color + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", isAirConditioner=" + isAirConditioner +
                '}';
    }

    public class CarBuilder {
        public CarBuilder() {
            new Car();
        }

        public CarBuilder addModel(String model) {
            Car.this.model = model;
            return this;
        }

        public CarBuilder addColor(String color) {
            Car.this.color = color;
            return this;
        }

        public CarBuilder addDataOfProduction(LocalDate date) {
            Car.this.dataOfProduction = date;
            return this;
        }

        public CarBuilder addEngineCapacyty(double engCapacity) {
            Car.this.engineCapacyty = engineCapacyty;
            return this;
        }

        public CarBuilder addPassengerCapacyty(int pasCapacity) {
            Car.this.passengerCapacity = pasCapacity;
            return this;
        }

        public Car build() {
            return Car.this;

        }

        public CarBuilder setIsAirConditioning(boolean air) {
            Car.this.isAirConditioner = air;
            return this;
        }
    }
}
