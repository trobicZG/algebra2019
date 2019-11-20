import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Application {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("BMW", "1", 2011, 85F));
        vehicles.add(new Vehicle("Mazda", "3", 2015, 115F));
        vehicles.add(new Vehicle("Ford", "Focus", 2016, 200F));
        vehicles.add(new Vehicle("Audi", "A4", 2017, 185F));
        vehicles.add(new Vehicle("Renault", "Clio", 2011, 45F));

        Collections.sort(vehicles);

        System.out.println("Najmlade: " + vehicles.get(4));
        System.out.println("Najstarije: " + vehicles.get(0));

        System.out.println("Prosjek starosti: " + getAverage(vehicles));
    }

    private static double getAverage(ArrayList<Vehicle> vehicles) {
        int counter = 0;
        int sum = 0;

        for (Vehicle v : vehicles) {
            sum += LocalDate.now().getYear() - v.getYearOfManufacturing();
            counter++;
        }

        return sum / counter;
    }
}

