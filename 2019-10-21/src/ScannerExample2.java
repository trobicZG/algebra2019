import java.util.Scanner;

public class ScannerExample2 {

    // Napišite program koji će u prvom redu ispisati vaše ime i prezime,
    // nakon toga jedan red prazno i u trećem redu naziv mjesta u kojem živite.

    // Zatim te podatke ispisati u jednoj liniji odvojene povlakom ( - )
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ime: ");
        String firstName = scanner.next();

        System.out.println("Prezime: ");
        String lastName = scanner.next();

        System.out.println();
        System.out.println("Grad: ");
        String city = scanner.next();

        System.out.println(firstName + " - " + lastName + " - " + city);
    }
}
