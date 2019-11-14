import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(" Enter first number :");
                firstNumber = Integer.parseInt(scanner.nextLine());
                System.out.println(" Enter second number :");
                secondNumber = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 1; i<firstNumber; i++) {
            for (int j = 1 ; j < secondNumber; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

    }


}
