public class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        if (this.isEngineOn) {
           throw new EngineChangeStateException(this.getManufacturer(), this.getModel(), "START");
        }
        System.out.println("Starting engine for motorcycle " + getModel());
        this.isEngineOn = true;
    }

    @Override
    public void stopEngine() {
        if (this.isEngineOn) {
            System.out.println("Stopping engine for motorcycle " + getModel());
            this.isEngineOn = false;
            return;
        }
        throw new IllegalStateException("Engine is already off!");
    }

    @Override
    public void honk(int howManySecond) {
        for (int i = 0; i < howManySecond; i++) {
            System.out.print("Motorcycle is using the horn! ");
        }
        System.out.println();
    }
}
