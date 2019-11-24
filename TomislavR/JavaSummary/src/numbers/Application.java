package numbers;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int from, to, checkingNumber;
        while (true) {
            System.out.println("FROM: ");
            try {
                from = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid value. Try again.");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("TO: ");
            try {
                to = Integer.parseInt(scanner.nextLine());
                if (to <= from) {
                    throw new IllegalArgumentException("TO number must be larger than FROM number.");
                }
            } catch (Exception e) {
                System.out.println("Invalid value. Try again.");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("Checking number: ");
            try {
                checkingNumber = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid value. Try again.");
                continue;
            }
            break;
        }

        int counter = 0;
        for (int i = from; i < to; i++) {
            if (i % checkingNumber == 0) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("Found numbers: " + counter);
    }
}
