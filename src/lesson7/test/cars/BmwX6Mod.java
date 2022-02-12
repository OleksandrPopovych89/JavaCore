package lesson7.test.cars;

public class BmwX6Mod extends BmwX6 {
    public BmwX6Mod() {
        super();
    }

    @Override
    public void workedEngine() {
        System.out.println("BmwX6mod: Engine Running on Diesel.");
        System.out.println("BmwX6mod: Max Speed: " + getMaxSpeed());
    }

    @Override
    public void lightsShine() {
        System.out.println("BmwX6mod: Xenon Headlights.");
        super.lightsShine();
    }

}
