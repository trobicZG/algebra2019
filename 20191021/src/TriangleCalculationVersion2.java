import java.util.Scanner;

public class TriangleCalculationVersion2 {

    // Napišite program izračunati duljinu hipotenuze pravokutnog trokuta
    // ako imamo zadane duljine kateta a i b.
    // Hipotenuza se računa pomoću Pitagorinog poučka: c2 = a2 + b2
    // a i b stranice unosi korisnik kroz konzolu

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        int a = scanner.nextInt();

        System.out.println("b:");
        int b = scanner.nextInt();

        double result = Math.pow(a, 2) + Math.pow(b, 2);

        System.out.println("c2 =  " + result);
    }
}
