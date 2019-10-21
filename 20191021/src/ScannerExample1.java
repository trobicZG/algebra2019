import java.util.Scanner;

public class ScannerExample1 {
    // Primjer upisa s konzole

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi neki tekst: ");
        String testInput = scanner.nextLine();

        System.out.println("Izlaz je: " + testInput);
    }
}
