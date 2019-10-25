import java.util.Scanner;

//Mjenjacnica
//
//        koliko se dobije USD i EUR za X kuna?
//        tecaj:
//        EUR 7.3
//        USD 6.2
//
//        Format ispisa:
//        X HRK = X EUR | X USD

public class Task4ExchangeOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Koliko HRK: ");
        int hrk = scanner.nextInt();

        printExchangeResult(hrk);
    }

    public static void printExchangeResult(int hrk) {
        System.out.println(hrk + " HRK = " + hrk/7.3 + " EUR | " + hrk/6.2 + " USD");
    }
}
