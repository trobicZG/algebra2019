import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();
        String name;
        int age;
        for (int i=0; i<5;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ime:");
            name=scanner.next();
            System.out.println("Godine:");
            age=scanner.nextInt();
            Student s=new Student(name, age);
            list.add(s);
        }

        for(int i=0;i<5;i++) {
            System.out.println(list.get(i).getName());
        }

    }
}
