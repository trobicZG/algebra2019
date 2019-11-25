package ZAD1B;

import java.util.Scanner;

public class Numbers {
/* Odgovori na teorijski dio
    1. A
    2. B
    3. D
    4. A
    5. C
    6. D
    7. B
    8. A

 */


    public static void main(String[] args) {
        int x=10, y=10;
        boolean b = (y>10) && (x++>10);
        System.out.println(b);
        System.out.println(x);

        int i = 0;
        for(i=0;i<10;i++);
        System.out.println(i+4);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite troznamenkasti broj: ");
        int number = scanner.nextInt();
        if (number < 100 || number > 999) {
            System.out.println(" Krivi unos, završetak programa!");
        } else {
            int sum = 0;
            while (number != 0) {
                sum = sum * 10 + number % 10;
                number /= 10;
            }
            System.out.println("Obrnuti broj : " + sum);
        }
    }
}
