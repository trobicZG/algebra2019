package namebook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.id + "," + this.firstName + "," + this.lastName;
    }

    public static Student fromConsole() {
        Scanner scanner = new Scanner(System.in);
        Student s = new Student();

        System.out.println("First name: ");
        s.setFirstName(scanner.next());

        System.out.println("Last name: ");
        s.setLastName(scanner.next());

        boolean isIdValid = false;
        while (!isIdValid) {
            System.out.println("ID number: ");

            try {
                s.setId(scanner.nextLong());
            } catch (InputMismatchException e) {
                System.out.println("ID is not valid. Try again!");
                continue;
            }
            isIdValid = true;
        }

        return s;
    }

    public static Student fromString(String input) {
        String[] values = input.split(",");
        Student s = new Student();
        s.setId(Long.parseLong(values[0]));
        s.setFirstName(values[1]);
        s.setLastName(values[2]);

        return s;
    }
}
