import java.util.Scanner;

public class Application {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int answer = Izbornik();

        switch (answer) {
            case 1:
                Kvadrat();
                break;
            case 2:
                Pravokutnik();
                break;
            case 3:
                Trokut();
                break;
            default:
                System.out.println(" Krivi unos!");
        }
    }

    private static void Trokut() {
        System.out.println( " Unesite visinu :");
        int height = scanner.nextInt();
        int count = 1;
        for ( int i = 0; i < height; i++) {
            for ( int j=0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }

    private static void Pravokutnik() {
        System.out.println( " Unesite stranicu 1 :");
        int side = scanner.nextInt();
        System.out.println( " Unesite stranicu 2 :");
        int side2 = scanner.nextInt();

        for ( int i=0; i < side; i++) {
            for ( int j=0; j < side2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void Kvadrat() {
        System.out.println( " Unesite stranicu :");
        int side = scanner.nextInt();

        for ( int i=0; i < side; i++) {
            for ( int j=0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static int Izbornik() {
        System.out.println(" Izbornik:");
        System.out.println("  1--Kvadrat");
        System.out.println("  2--Pravokutnik");
        System.out.println("  3--Pravokutni trokut");
        System.out.println(" Odabir : ");
        return scanner.nextInt();
    }
}
