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

        try {
            c.changeEngineState(EngineStateConstants.ENGINE_START);
            c.changeEngineState(EngineStateConstants.ENGINE_STOP);
            // c.stopEngine();
            c.honk(3);

            //m.stopEngine();
            m.changeEngineState(EngineStateConstants.ENGINE_START);
            //m.startEngine();
            m.changeEngineState(EngineStateConstants.ENGINE_STOP);
            m.honk(2);
        } catch (EngineChangeStateException e) {
            System.out.println(e.getMessage());
        }

    }
}
