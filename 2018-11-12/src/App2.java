import java.io.IOException;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Options: ");
        System.out.println("1. Search by ID");
        System.out.println("2. Search by phone number");

        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("ID:");
            int id = scanner.nextInt();

            Person p = Database.findById(id);
            System.out.println(p.toString());
        } else if (option == 2) {
            //search by phone number
        }


    }
}
