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
        System.out.println("Starting engine for car " + this.getModel());
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine for car " + this.getModel());
    }

    @Override
    public void honk(int howManySecond) {
        for (int i = 0; i < howManySecond * 10; i++) {
            System.out.print("Car is using horn! ");
        }
        System.out.println();
    }
}
