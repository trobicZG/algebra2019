public abstract class Vehicle implements  VehicleInterface {

    private final String START_ENGINE_COMMAND = "START";
    private final String STOP_ENGINE_COMMAND = "STOP";

    private String color;
    private double mileage;
    private Manufacturer manufacturer;
    private String model;
    protected boolean started = false;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    private void startEngine() throws IllegalStateException {
        if (!started) {
            started = true;
            System.out.println("Starting engine for " + this.getClass().getName() + " " + this.getClass().getName() + " " + getModel());
        }
        else
            throw new EngineChangeStateException(this.getManufacturer(), this.getModel(), START_ENGINE_COMMAND) ;
    }

    private void stopEngine() {
        if (!started) {
            started = false;
            System.out.println("Stopping engine for " + this.getClass().getName() + " " + this.getManufacturer().getName() + " " + getModel());
        }
        else
            throw new EngineChangeStateException(this.getManufacturer(), this.getModel(), STOP_ENGINE_COMMAND) ;
    }

    public void changeEngineState(String state) {

        if (state.equals(START_ENGINE_COMMAND))
            startEngine();
        else if (state.equals(STOP_ENGINE_COMMAND))
            startEngine();
        else
            throw new IllegalStateException();

    }

    private double topSpeed;
}
