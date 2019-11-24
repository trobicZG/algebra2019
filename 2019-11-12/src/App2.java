import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class App2 {
    private static final int SEARCH_BY_ID = 1;
    private static final int SEARCH_BY_PHONE_NUMBER = 2;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Options: ");
        System.out.println("1. Search by ID");
        System.out.println("2. Search by phone number");

        int option = Integer.parseInt(scanner.nextLine());

        if (option == SEARCH_BY_ID) {
            System.out.println("ID:");
            int id = Integer.parseInt(scanner.nextLine());

            try {
                System.out.println(Database.findById(id).toString());
            } catch (NoPersonFoundException e) {
                System.out.println(e.getMessage());
            }
        } else if (option == SEARCH_BY_PHONE_NUMBER) {
            System.out.println("Phone number:");
            String phoneNumber = scanner.nextLine();
            List<Person> persons = Database.findPersonsByPhoneNumber(phoneNumber);

            if (persons.isEmpty()) {
                System.out.println("No users found for that phone number.");
            } else if (persons.size() == 1) {
                System.out.println(persons.get(0).toString());
            } else {
                System.out.println("Found multiple people. Select row id of person you want details for:");
                for (int i = 0; i < persons.size(); i++) {
                    System.out.println(i + ": " + persons.get(i).getFirstName() + " " + persons.get(i).getLastName());
                }

                int rowId = Integer.parseInt(scanner.nextLine());
                System.out.println(persons.get(rowId).toString());
            }

        }


    }
}
