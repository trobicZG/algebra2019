import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        final int MAX_NUMBER = 6;
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[MAX_NUMBER];
        for (int i = 0; i < MAX_NUMBER; i++) {
            try {
                System.out.println("Enter number: ");
                array[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Wrong input!");
                i--;
            }
        }
        for (int i = 0; i < MAX_NUMBER; i++)
            System.out.println(array[i]);

    }
}
