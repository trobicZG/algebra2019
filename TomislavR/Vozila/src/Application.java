import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            System.out.println("Manufacturer : ");
            String manufacturer = scanner.nextLine();
            System.out.println("Model : ");
            String model = scanner.nextLine();
            System.out.println("Year of manufacture : ");
            int year = scanner.nextInt();
            System.out.println("Manufacturer : ");
            double power = scanner.nextDouble();
            Vehicle vehicle = new Vehicle(manufacturer, model, year, power);
            listOfVehicles.add(vehicle);
        }

        Collections.sort(listOfVehicles);

    }
}
