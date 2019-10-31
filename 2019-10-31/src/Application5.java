import java.util.ArrayList;
import java.util.List;
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
            int age = scanner.nextInt();

            students.add(new Student(name, age));
        }

        System.out.println("Average: " + calculateStudentAverageAge(students));
    }

    private static Double calculateStudentAverageAge(List<Student> students) {
        Double sumAge = 0D;

        for (Student s : students) {
            sumAge += s.getYears();
        }

        return sumAge / students.size();
    }

}
