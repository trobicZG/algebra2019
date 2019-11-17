package task5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sec: ");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        System.out.println(hours+" hours, " + minutes + " minutes, " + seconds + " seconds");

    }
}
