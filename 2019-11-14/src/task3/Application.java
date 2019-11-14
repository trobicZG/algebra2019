package task3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            System.out.println("Unesi broj:");
            int number;
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Neispravan unos. Mora biti INT.");
                continue;
            }

            if (number % 5 == 0 || number % 7 == 0) {
                System.out.println("Dijeljivo s 5 ili 7");
            }

            if (number > 0) {
                System.out.println("Pozitivan broj");
            }

            System.out.println(isPalindrome(number) ? "Palindrom je" : "Nije palindrom");

            if (number == 0) {
                break;
            }

            counter++;
            sum += number;
        }

        System.out.println("Numbers count: " + counter);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / counter);
    }

    private static boolean isPalindrome(Integer num) {
        String str = num.toString();
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
