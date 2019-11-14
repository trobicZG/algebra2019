package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Application {
    private static final int PEOPLE_TO_ENTER = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        int i = 0;
        while (i < PEOPLE_TO_ENTER) {
            Person p = new Person();

            System.out.println("First name:");
            p.setFirstName(scanner.nextLine());

            System.out.println("Last name:");
            p.setLastName(scanner.nextLine());

            boolean ageEntered = false;
            while (!ageEntered) {
                System.out.println("Age: ");
                try {
                    p.setAge(Integer.parseInt(scanner.nextLine()));
                } catch (Exception e) {
                    System.out.println("Age isn't correct. Try again.");
                    continue;
                }
                ageEntered = true;
            }
            people.add(p);
            i++;
        }

        System.out.println("Unsorted:");
        System.out.println(people.toString());
        Collections.sort(people);
        System.out.println("Sorted:");
        System.out.println(people.toString());

        Double average = people.stream().mapToDouble(Person::getAge).average().getAsDouble();
        System.out.println(String.format("Average age: %s", average));

    }

}
