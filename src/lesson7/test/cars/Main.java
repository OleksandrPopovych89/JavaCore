package lesson7.test.cars;

public class Main {
    public static void main(String[] args) {
        ACar carX6 = new BmwX6();
        carX6.carRides();
        ((BmwX6) carX6).lightsShine();

        ACar carX6mod = new BmwX6Mod();
        carX6mod.carRides();
        ((BmwX6) carX6mod).lightsShine();

        BmwX6 carX6mod2 = new BmwX6Mod();
        carX6mod2.carRides();
        carX6mod2.lightsShine();

    }
}
