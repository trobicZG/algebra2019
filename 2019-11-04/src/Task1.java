// Napisati program koji ima jedno int polje od 5 mjesta,
// u to polje pomoću for petlje probati upisati 6 brojeva,
// riješiti zadatak upotrebom try catch bloka i hvatanjem greške.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter number: ");
            try {
                numbers[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Error with that value. Must be an integer.");
                i--; // i = i - 1;
            }
        }

        System.out.println("Finished.");
    }
}
