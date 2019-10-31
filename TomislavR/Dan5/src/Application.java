public class Application {
    public static void main(String[] args) {
        Car c = new Car();
        c.setDoorsCount(5);
        c.setColor("Black");
        c.setMileage(10000);
        c.setModel("Golf 7");
        c.setTopSpeed(300);

        c.setManufacturer(new Manufacturer("VW", "Address 1"));

        Motorcycle m = new Motorcycle();
        m.setColor("Blue");
        m.setModel("Tracer 900");
        m.setMileage(20000);
        m.setTopSpeed(270);
        m.setManufacturer(new Manufacturer("Yamaha", "Japanska 123"));

        try {
            c.startEngine();
            c.startEngine();
            c.stopEngine();
            c.honk(3);
        } catch (EngineChangeStateException e) {
            System.out.println("Error : "+e.getMessage());
        }

        try {
            m.startEngine();
            m.stopEngine();
            m.stopEngine();
            m.honk(2);
        } catch (EngineChangeStateException e) {
            System.out.println("Error : "+e.getMessage());
        }


        try {
            int[] abc = {1,2,3};
            System.out.println(abc[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error while accessing array element!");
        }

        System.out.println("abc");
    }
}
