package task4;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Odaberi opciju:");
        System.out.println("1. kvadrat");
        System.out.println("2. pravokutnik");
        System.out.println("3. pravokutni trokut");
        int option = Integer.parseInt(scanner.nextLine());

        if (option == 1) {
            System.out.println("Size: ");
            int size = Integer.parseInt(scanner.nextLine());
            Drawings.drawSquare(size);
        }

        if (option == 2) {
            System.out.println("a: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.println("b: ");
            int b = Integer.parseInt(scanner.nextLine());

            Drawings.drawRectangle(a, b);
        }

        if (option == 3) {
            System.out.println("Height: ");
            int height = Integer.parseInt(scanner.nextLine());
            Drawings.drawTriangle(height);
        }
    }
}
