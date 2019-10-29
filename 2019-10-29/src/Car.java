public class Car extends Vehicle {
    private Integer doorsCount; // broj vrata
    private boolean isCabrio;

    public Integer getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(Integer doorsCount) {
        this.doorsCount = doorsCount;
    }

    public boolean isCabrio() {
        return isCabrio;
    }

    public void setIsCabrio(boolean cabrio) {
        isCabrio = cabrio;
    }

    @Override
    public void startEngine() {
        if (this.isEngineOn) {
            System.out.println("Error - engine is already turned on.");
            return;
        }
        System.out.println("Starting engine for car " + this.getModel());
        this.isEngineOn = true;
    }

    @Override
    public void stopEngine() {
        if (this.isEngineOn) {
            System.out.println("Stopping engine for car " + this.getModel());
            this.isEngineOn = false;
            return;
        }
        System.out.println("Error - engine is already turned off!");
    }

    @Override
    public void honk(int howManySecond) {
        for (int i = 0; i < howManySecond * 10; i++) {
            System.out.print("Car is using horn! ");
        }
        System.out.println();
    }
}
