package namebook;

import java.io.*;
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

                if (option == 2) {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"));
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        String[] values = line.split(",");
                        Student s = new Student();
                        s.setId(Long.parseLong(values[0]));
                        s.setFirstName(values[1]);
                        s.setLastName(values[2]);

                        System.out.println(s);
                    }
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
