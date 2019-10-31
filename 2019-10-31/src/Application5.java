import java.util.ArrayList;
import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Unesi ime: ");
            String name = scanner.next();

            System.out.println("Unesi dob: ");
            int years = scanner.nextInt();

            Student s = new Student();

            s.setName(name);
            s.setYears(years);

            students.add(s);
        }

        Double averageYears = 0D;

        for (Student s : students) {
            averageYears = averageYears + s.getYears();
        }

        System.out.println("Average: " + averageYears / 3);
    }


}
