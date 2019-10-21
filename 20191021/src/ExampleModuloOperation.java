import java.util.Scanner;

public class ExampleModuloOperation {

    // Napišite program koji će ispitati da li je uneseni broj djeljiv s 5 bez ostatka ili ne,
    // te će sukladno tome ispisati odgovarajuću poruku (if-else uvjet).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi broj: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber % 5 == 0) {
            System.out.println("Broj je djeljiv s 5");
        } else {
            System.out.println("Broj nije djeljiv s 5");
        }
    }
}
