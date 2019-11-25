package ZAD3B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 5;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            System.out.println(i+1 + ". student");
            System.out.print(" Broj indeksa: ");
            int numberOfIndex = Integer.parseInt(scanner.nextLine());
            System.out.print(" Ime: ");
            String name = scanner.nextLine();
            System.out.print(" Prezime: ");
            String surname = scanner.nextLine();
            System.out.print(" Adresa: ");
            String address = scanner.nextLine();
            System.out.print(" Prosjek: ");
            double averageGrade = Double.parseDouble(scanner.nextLine());

            Student student = new Student(numberOfIndex, name, surname, address, averageGrade);
            students.add(student);
        }

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s.getNumberOfIndex() + ", " + s.getName() + ", " + s.getSurname() + ", " + s.getAddress() + ", " + s.getAverageGrade());
        }
    }
}
