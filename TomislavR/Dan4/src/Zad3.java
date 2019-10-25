import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Days: ");
        int days = scanner.nextInt();
        date(days);
    }

    public static void date(int days) {
        int months=days/30;
        int days2=days%30;
        int years=months/12;
        months=months-(years*12);
        System.out.println(days2 + " - " + months + " - " + years);
    }
}
