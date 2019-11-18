import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws IOException {
        String EXIT_INPUT = "x";
        String name = "a";
        int age = 0;
        int grade = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("  Unesite ime ili x za završetak unosa: ");
            name = scanner.nextLine();
            if (name.equals(EXIT_INPUT))
                break;
            while (true) {
                System.out.print(" Unesite broj godina: ");
                try {
                    age = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Krivi unos broja godina, probajte opet!");
                }
            }
            while (true) {
                System.out.print(" Unesite ocjenu: ");
                try {
                    grade = Integer.parseInt(scanner.nextLine());
                    if (grade < 1 || grade > 5)
                        throw new IllegalArgumentException();
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Krivi unos ocjene, probajte opet!");
                }
            }
            Person person = new Person(name,age, grade);
            Repository.addNew(person.toString());
        }

        ArrayList<String> personsString = Repository.getAllRows();

        HashMap<Integer, Integer> counterMap = new HashMap<>();

        for (int i = 0; i<personsString.size(); i++) {
            Person person = Person.mapper(personsString.get(i));
            if (counterMap.containsKey(person.getGrade())) {
                counterMap.put(person.getGrade(), counterMap.get(person.getGrade()) + 1);
            } else {
                counterMap.put(person.getGrade(), 1);
            }
        }

        System.out.println("Ocjene :");
        System.out.println(" 1: " + counterMap.get(1));
        System.out.println(" 2: " + counterMap.get(2));
        System.out.println(" 3: " + counterMap.get(3));
        System.out.println(" 4: " + counterMap.get(4));
        System.out.println(" 5: " + counterMap.get(5));

    }
}
