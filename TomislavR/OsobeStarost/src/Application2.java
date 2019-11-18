import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws IOException {
        final int MIN_GRADE = 1;
        final int MAX_GRADE = 5;
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
        for (int i = MIN_GRADE; i<=MAX_GRADE; i++) {
            System.out.println(i + ": " + counterMap.get(i));
        }

    }
}
