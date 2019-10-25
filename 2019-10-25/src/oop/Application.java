package oop;

public class Application {

    public static void main(String[] args) {
       Dog dog = new Dog();
       Cat cat = new Cat();

       dog.run();
       cat.run();
       dog.speak("Algebra");
       cat.speak("Java");

    }
}
