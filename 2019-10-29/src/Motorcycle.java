public class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        if (this.isEngineOn) {
            System.out.println("Error - engine is already turner on");
            return;
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
        System.out.println("Error - Engine is already turned off");
    }

    @Override
    public void honk(int howManySecond) {
        for (int i = 0; i < howManySecond; i++) {
            System.out.print("Motorcycle is using the horn! ");
        }
        System.out.println();
    }
}
