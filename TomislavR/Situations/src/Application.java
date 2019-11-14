import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int number = 1;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        while (number != 0) {
            number = scanner.nextInt();
            if (number % 5 == 0 || number % 7 == 0) {
                System.out.println("Dijeljivo sa 5 ili 7.");
            }
            if (number > 0) {
                System.out.println("Pozitivan");
            }
            int temp = number;
            int number2 = 0;

            while(temp!=0)
            {
                number2 = (number2*10)+temp % 10;
                temp = temp/10;
            }
            if(number == number2)
                System.out.println("It is a Palindrome number.");
            else
                System.out.println("Not a palindrome");


        }
    }
}
