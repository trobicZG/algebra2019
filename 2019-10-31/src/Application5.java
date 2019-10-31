import java.util.ArrayList;
import java.util.Scanner;

public class Application5 {
    private static final int NUMBER_OF_STUDENTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            System.out.println("Unesi ime: ");
            String name = scanner.next();

            System.out.println("Unesi dob: ");
            int years = scanner.nextInt();

            students.add(new Student(name, years));
        }

        Double averageYears = 0D;

        for (Student s : students) {
            averageYears += s.getYears();
        }

        System.out.println("Average: " + averageYears / NUMBER_OF_STUDENTS);
    }

}
