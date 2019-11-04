package namebook;

import java.io.IOException;
import java.util.*;

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
                    ReadWriteUtil.saveToTxt(s);
                }

                if (option == 2) {
                    ArrayList<Student> students = ReadWriteUtil.toStudentsList();

                    System.out.println("All students: " + students);
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
