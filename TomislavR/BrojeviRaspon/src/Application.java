import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int firstNumber, secondNumber, x;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                while (true) {
                    System.out.print(" Unesite prvi broj raspona :");
                    firstNumber = Integer.parseInt(scanner.nextLine());
                    System.out.print(" Unesite drugi broj raspona :");
                    secondNumber = Integer.parseInt(scanner.nextLine());
                    if (firstNumber > secondNumber) {
                        System.out.println(" Krivi unos raspona, pokušajte ponovo!");
                    } else {
                        break;
                    }

                }

                System.out.print(" Unesite broj za djeljivost :");
                x = Integer.parseInt(scanner.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Niste unjeli cijele brojeve, pokušajte ponovo!");
            }
        }

        int counter = 0;
        for (int i=firstNumber; i<=secondNumber; i++) {
            if (i%x == 0)
                ++counter;
        }
        System.out.println("  Ima " + counter + " takvih brojeva u zadanom rasponu.");

    }
}
