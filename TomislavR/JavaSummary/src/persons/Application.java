package persons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        while (true) {
            System.out.println("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter last name:");
            String lastName = scanner.nextLine();
            int age = 0;
            while (true) {
                System.out.println("Enter age");
                try {
                    age = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println("Error while entering age. Try again!");
                }
                break;
            }

            Person p = new Person(firstName, lastName, age);
            people.add(p);

            System.out.println("Exit? (Y)es / (N)o");
            if (scanner.nextLine().trim().equalsIgnoreCase("Y")) {
                break;
            }
        }
        System.out.println("Entered " + people.size() + " people.");

        System.out.println("Unsorted:");
        System.out.println(people);

        Collections.sort(people);

        System.out.println("Sorted: ");
        System.out.println(people);

        System.out.println("MIN:");
        System.out.println(Collections.min(people));

        System.out.println("MAX:");
        System.out.println(Collections.max(people));
    }
}