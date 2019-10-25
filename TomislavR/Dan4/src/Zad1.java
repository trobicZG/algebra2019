import java.util.Scanner;
public class Zad1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("height: ");
        int height = scanner.nextInt();
        printTriangle(height);
    }

    public static void printTriangle(int height) {
        int blank=height-1;
        int stars=1;
        for (int i=0; i<height; i++) {
            for(int j=0; j<blank; j++) {
                System.out.print(" ");
            }
            for(int k=0; k<stars; k++) {
                System.out.print("*");
            }
            blank-=1;
            stars+=2;
            System.out.println();
        }
    }
}
