package task3;

import java.io.IOException;
import java.util.*;

public class Application {

    private static final int MIN_GRADE = 1;
    private static final int MAX_GRADE = 5;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.println("Enter last name:");
            String lastName = scanner.nextLine();
            int age = 0;
            while (true) {
                System.out.println("Enter age");
                try {
                    age = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println("Error while entering age. Try again!");
                }
                break;
            }

            int grade = 0;
            while (true) {
                System.out.println("Enter grade");
                try {
                    grade = Integer.parseInt(scanner.nextLine());
                    if (grade < MIN_GRADE || grade > MAX_GRADE) {
                        throw new IllegalArgumentException("Grade must be between 1 and 5");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            }

            Student s = new Student(firstName, lastName, age, grade);
            StudentRepository.addStudent(s);

            System.out.println("Exit? (Y)es / (N)o");
            if (scanner.nextLine().trim().equalsIgnoreCase("Y")) {
                break;
            }
        }

        ArrayList<Student> students = StudentRepository.getAllStudents();
        System.out.println("All students:");
        System.out.println(students.toString());

        Map<Integer, Integer> gradesMap = new HashMap<>();

        for (Student s : students) {
            if (gradesMap.containsKey(s.getGrade())) {
                gradesMap.put(s.getGrade(), gradesMap.get(s.getGrade()) + 1);
            } else {
                gradesMap.put(s.getGrade(), 1);
            }
        }

        for (int i = MIN_GRADE; i <= MAX_GRADE; i++) {
            System.out.println(i + " : " + (gradesMap.get(i) == null ? 0 : gradesMap.get(i)));
        }

        List<Integer> abc = new LinkedList<>();
    }
}