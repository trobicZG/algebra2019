package oop;

public class Cat extends Animal implements AnimalInterface {
    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void speak(String whatToSay) {
        System.out.println("MJAU MJAU " + whatToSay);
    }
}
