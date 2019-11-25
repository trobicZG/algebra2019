package ZAD2B;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Unesite duljinu katete: ");
        int cathetus = scanner.nextInt();
        int counter = 1;
        for (int i = 0; i < cathetus; i++){
            for(int j = 0; j<counter; j++) {
                System.out.print("*");
            }
            counter++;
            System.out.println();
        }

    }
}
