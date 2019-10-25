package oop;

public class Application {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.setColor("Blue");
        a2.setColor("Red");

        a1.setLegsCount(4);
        a1.setSpeed(100D);
        a1.setTeethCount(30);

        Dog dog = new Dog();


        System.out.println(a1.getColor());

    }
}
