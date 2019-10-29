public abstract class Vehicle implements VehicleInterface {

    private String color;
    private Double mileage; // koliko prijedenih kilometara
    private Manufacturer manufacturer;
    private String model;
    private Double topSpeed;

    protected boolean isEngineOn = false;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
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

    public Double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Double topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public void changeEngineState(String state) {
        if (state.equals(EngineStateConstants.ENGINE_START)) {
            startEngine();
        } else if (state.equals(EngineStateConstants.ENGINE_STOP)) {
            stopEngine();
        } else {
            throw new IllegalStateException("Invalid command for engine state!");
        }
    }

    private void startEngine() {
        if (this.isEngineOn) {
            throw new EngineChangeStateException(this.getManufacturer(), getModel(), EngineStateConstants.ENGINE_START);
        }
        System.out.println("Starting engine for " + this.getClass().getName() + " " + getManufacturer().getName() + " " + getModel());
        this.isEngineOn = true;
    }

    private void stopEngine() {
        if (this.isEngineOn) {
            System.out.println("Stopping engine for " + this.getClass().getName() + " " + getManufacturer().getName() + " " + getModel());
            this.isEngineOn = false;
            return;
        }
        throw new EngineChangeStateException(getManufacturer(), getModel(), EngineStateConstants.ENGINE_STOP);
    }
}
