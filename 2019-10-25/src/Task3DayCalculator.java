import java.util.Scanner;

public class Task3DayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi broj dana: ");
        int days = scanner.nextInt();

        printYearsMonthsDays(days);

    }

    public static void printYearsMonthsDays(int days) {
        int months = days / 30;
        days = days - months * 30;

        int years = months / 12;
        months = months - years * 12;

        System.out.println(years + "god " + months + "mj " + days + "d");
    }
}
