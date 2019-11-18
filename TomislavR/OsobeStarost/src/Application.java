import java.util.*;

public class Application {

    public static void main(String[] args) {
        String EXIT_INPUT = "x";
        String name = "a";
        int age = 0;
        ArrayList<Person> persons = new ArrayList<Person>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("  Unesite ime ili x za završetak unosa: ");
            name = scanner.nextLine();
            if (name.equals(EXIT_INPUT))
                break;
            while (true) {
                System.out.print( " Unesite broj godina: ");
                try {
                    age = Integer.parseInt(scanner.nextLine());
                    break;
                }
                catch (IllegalArgumentException e) {
                    System.out.println( "Krivi unos broja godina, probajte opet!");
                }
            }

            Person person = new Person(name, age);
            persons.add(person);
        }

        Collections.sort(persons);
        System.out.println( "Osobe poredane po dobi (od najmlađe do najstarije) :");
        for (int i=0; i<persons.size(); i++) {
            System.out.println(persons.get(i).getName() + "  " + persons.get(i).getAge());
        }
        Collections.reverse(persons);
        System.out.println( "Osobe poredane po dobi (od najstarije do najmlađe) :");
        for (int i=0; i<persons.size(); i++) {
            System.out.println(persons.get(i).getName() + "  " + persons.get(i).getAge());
        }
        System.out.println(" Najstarija osoba : " + persons.get(0).getName());
        System.out.println(" Najmlađa osoba : " + persons.get(persons.size()-1).getName());
    }

}
