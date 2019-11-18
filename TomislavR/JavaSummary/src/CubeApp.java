import java.util.Scanner;

public class CubeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Max : ");
        int max = scanner.nextInt();
        System.out.print(" Min : ");
        int min = scanner.nextInt();
        System.out.println(CubeThrowing.getRandomNumber(min, max));
    }
}
