import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kune: ");
        int kune = scanner.nextInt();
        rate(kune);
    }

    public static void rate(int kune) {
        System.out.println(kune+" HRK = " + kune/7.3 + " EUR | " + kune/6.2 + " USD");
    }
}
