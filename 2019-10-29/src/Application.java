public class Application {
    public static void main(String[] args) {

        Car c = new Car();
        c.setDoorsCount(5);
        c.setColor("Black");
        c.setMileage(1000D);
        c.setModel("Golf 7");
        c.setTopSpeed(300D);

        Manufacturer manufacturer = new Manufacturer("VW", "Address 1");

        c.setManufacturer(manufacturer);

    }
}
