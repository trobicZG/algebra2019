import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Unesite broj sekundi: ");
        int seconds = scanner.nextInt();
        System.out.println(seconds%60 + " sekundi " + seconds/60 + " minuta i " + seconds/3600 + " sati" );
    }
}
