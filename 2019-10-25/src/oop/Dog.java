package oop;

public class Dog extends Animal implements AnimalInterface {

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void speak(String whatToSay) {
        System.out.println("WOF WOF " + whatToSay);
    }
}
