package namebook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        boolean exitApplication = false;
        while (!exitApplication) {
            showMainMenu();
            try {
                int option = scanner.nextInt();

                if (option != 0 && option != 1 && option != 2) {
                    throw new IllegalArgumentException("Invalid option");
                }

                if (option == 0) {
                    break;
                }

                if (option == 1) {
                    Student s = new Student();

                    System.out.println("First name: ");
                    s.setFirstName(scanner.next());

                    System.out.println("Last name: ");
                    s.setLastName(scanner.next());

                    System.out.println("ID number: ");
                    String tmp = scanner.next();

                    try {
                        s.setId(Long.parseLong(tmp));
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("ID must contain only numbers.");
                    }

                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("students.txt", true));
                    bufferedWriter.write(s.toString());
                    bufferedWriter.newLine();
                    bufferedWriter.close();

                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid option");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("Choose your option:");
        System.out.println("0 -> Exit application");
        System.out.println("1 -> Add new student");
        System.out.println("2 -> Show all students");
    }
}
