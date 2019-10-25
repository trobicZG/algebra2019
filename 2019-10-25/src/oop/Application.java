package oop;

public class Application {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.setColor("Blue");
        a2.setColor("Red");

        System.out.println(a1.getColor());

    }
}
