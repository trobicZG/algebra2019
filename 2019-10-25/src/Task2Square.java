import java.util.Scanner;

public class Task2Square {
    // Nacrtati kvadrat u konozlu. Korisnik odreduje dimenzije.

    public static void main(String[] args) {

        System.out.println("Dimenzije kvadrata: ");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        drawSquare(size);

    }

    private static void drawSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
