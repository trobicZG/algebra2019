import java.util.Scanner;
public class Zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        int a = scanner.nextInt();
        printSquare(a);
    }

    public static void printSquare(int a) {
        for (int i=0; i<a; i++) {
            for(int j=0; j<a; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}