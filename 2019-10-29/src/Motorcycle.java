public class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting engine for motorcycle " + getModel());
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine for motorcycle " + getModel());
    }

    @Override
    public void honk(int howManySecond) {
        for (int i = 0; i< howManySecond; i++) {
            System.out.print("Motorcycle is using the horn! ");
        }
        System.out.println();
    }
}
