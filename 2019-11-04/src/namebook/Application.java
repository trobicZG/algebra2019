package namebook;

import java.io.IOException;
import java.util.*;

public class Application {
    private static final Scanner scanner = new Scanner(System.in);
    private static Map<Integer, String> allowedOptionsMap = new HashMap<>();

    private static final int EXIT_APPLICATION_CODE = 0;
    private static final int ADD_NEW_STUDENT_CODE = 1;
    private static final int SHOW_ALL_STUDENTS_CODE = 2;

    public static void main(String[] args) throws IOException {
        populateAllowedOptions();

        boolean exitApplication = false;
        while (!exitApplication) {
            showMainMenu();
            try {
                int option = scanner.nextInt();

                if (!allowedOptionsMap.containsKey(option)) {
                    throw new InvalidOptionException(option);
                }

                if (option == EXIT_APPLICATION_CODE) {
                    break;
                }

                if (option == ADD_NEW_STUDENT_CODE) {
                    Student s = Student.fromConsole();
                    ReadWriteUtil.saveToTxt(s);
                }

                if (option == SHOW_ALL_STUDENTS_CODE) {
                    ArrayList<Student> students = ReadWriteUtil.toStudentsList();
                    System.out.println("All students: " + students);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid option");
                scanner.next();
            } catch (IllegalArgumentException | InvalidOptionException e) {
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
        allowedOptionsMap.put(EXIT_APPLICATION_CODE, "Exit application.");
        allowedOptionsMap.put(ADD_NEW_STUDENT_CODE, "Add new student.");
        allowedOptionsMap.put(SHOW_ALL_STUDENTS_CODE, "Show all students.");
    }


}
