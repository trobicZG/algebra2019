package namebook;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Application {
    private static final Scanner scanner = new Scanner(System.in);
    private static Map<Integer, String> allowedOptionsMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        populateAllowedOptions();

        boolean exitApplication = false;
        while (!exitApplication) {
            showMainMenu();
            try {
                int option = scanner.nextInt();

                if (!allowedOptionsMap.containsKey(option)) {
                    throw new IllegalArgumentException("Invalid option value.");
                }

                if (option == 0) {
                    break;
                }

                if (option == 1) {
                    Student s = Student.fromConsole();

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
        for (int i = 0; i < allowedOptionsMap.size(); i++) {
            System.out.println(i + " -> " + allowedOptionsMap.get(i));
        }
    }

    private static void populateAllowedOptions() {
        allowedOptionsMap.put(0, "Exit application.");
        allowedOptionsMap.put(1, "Add new student.");
        allowedOptionsMap.put(2, "Show all students.");
    }


}
