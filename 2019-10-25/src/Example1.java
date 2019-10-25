import java.util.Scanner;

//1. Napraviti funkciju koja iscrtava trokut (jednostranicni) neke visine.
//        Korisnik kroz konzolu odreduje visinu.
//        Primjer ako je visina 5:
//
//            *
//           ***
//          *****
//         *******
//        *********

public class Example1 {
    public static void main(String[] args) {

        System.out.println("Visina trokuta: ");
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();

        drawTriangle(height);

    }

    public static void drawTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < (height - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
