public class Application {
    public static void main(String[] args) {

        Car c = new Car();
        c.setDoorsCount(5);
        c.setColor("Black");
        c.setMileage(1000D);
        c.setModel("Golf 7");
        c.setTopSpeed(300D);

        c.setManufacturer(new Manufacturer("VW", "Address 1"));

        Motorcycle m = new Motorcycle();
        m.setColor("Blue");
        m.setModel("Tracer 900");
        m.setMileage(20000D);
        m.setTopSpeed(270D);
        m.setManufacturer(new Manufacturer("Yamaha", "Japanska 123"));


        c.startEngine();
        c.stopEngine();
        c.stopEngine();
        c.honk(3);

        m.stopEngine();
        m.startEngine();
        m.startEngine();
        m.stopEngine();
        m.honk(2);

        int[] abc = {1,2,3};
        System.out.println(abc[10]);

        System.out.println("abc");

    }
}
