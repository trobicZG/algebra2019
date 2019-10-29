public class Motorcycle extends Vehicle {

    @Override
    public void honk(int howManySecond) {
        for (int i = 0; i < howManySecond; i++) {
            System.out.print("Motorcycle is using the horn! ");
        }
        System.out.println();
    }
}
