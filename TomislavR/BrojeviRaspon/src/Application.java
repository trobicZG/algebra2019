import java.util.ArrayList;
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
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i=firstNumber; i<=secondNumber; i++) {
            if (i%x == 0) {
                ++counter;
                numbers.add(i);
            }
        }
        System.out.println("  Ima " + counter + " takvih brojeva u zadanom rasponu.");
        System.out.print( " To su brojevi : ");
        for (int i = 0; i<numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }

    }
}
