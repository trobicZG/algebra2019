import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Constants.NUMBER_OF_PERSONS; i++) {
            Person person = new Person();
            System.out.println("Enter first name : ");
            person.setFirstName(scanner.nextLine());
            System.out.println("Enter last name : ");
            person.setLastName(scanner.nextLine());
            while (true) {
                System.out.println("Enter age : ");
                try {
                    int age = Integer.parseInt(scanner.nextLine());
                    if (age < 0 || age >100) {
                        throw new InvalidAgeException();
                    }
                    person.setAge(age);
                    break;
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            persons.add(person);
        }
        Collections.sort(persons);
        for (int i = 0; i < Constants.NUMBER_OF_PERSONS; i++) {
            System.out.println(persons.indexOf(i));
        }
    }
}
