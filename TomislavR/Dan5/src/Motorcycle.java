public class Motorcycle extends Vehicle {


    @Override
    public void honk(int howManySeconds) {
        for (int i = 0; i < howManySeconds; i++ )
            System.out.println("Motorcycle is using horn!");
    }

}
