import java.util.Scanner;

public class DynamicMultiplicationTable {

    // Ispisati tablicu mnozenja velicine koju korisnik odredi.
    // Ako korisnik unese 5, onda radimo tablicu mnozenja 5x5
    // Ako korisnik unese 7, onda radimo tablicu mnozenja 7x7

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi broj: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

}
