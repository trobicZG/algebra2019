package task2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("unesi velicinu tablice mnozenja");

        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j<=size; j++ ) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
