public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int a = 5;
        System.out.println("varijabla a = " + a);

        double b = 3.14;
        System.out.println("b = " + b);

        int c = (int) (a + b);
        System.out.println("c = " + c);

        boolean bool = false;
        System.out.println("bool = " + bool);

        short s = (short) 33000;
        System.out.println("s = " + s);

        char character = '#';
        System.out.println(character);

        String str = "Algebra";
        System.out.println(str);

        int temp = 10;

        if (temp > 0) {
            System.out.println("Toplo je");
        } else if (temp == 0) {
            System.out.println("Nula je");
        } else {
            System.out.println("Hladno je");
        }

        while (temp > 0) {
            System.out.println("Temp: " + temp);
            temp--; // temp = temp - 1;
            // temp++;  // temp = temp + 1;
        }

        temp = 5;
        do {
            System.out.println("do-while: " + temp);
            temp--;
        } while (temp > 0);

        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        System.out.println("-----------------");

        // zadatak 1:
        // ispisi sve brojeve od 0 do 1000

        for (int i = 0; i <= 1000; i++) {
            System.out.println("i: " + i);
        }

        // zad 2
        // ispisi sve brojeve od 0 do 1000 ali samo koji su parni
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("i: " + i);
            }
        }

        // zad 3
        // ispisi sve brojeve od 0 do 1000 ako su dijeljivi sa 7 i sa 5

        // zad 3 - v1
        for (int i = 0; i <= 1000; i++) {
            if (i % 7 == 0) {
                if (i % 5 == 0) {
                    System.out.println("i: " + i);
                }
            }
        }

        // zad 3 - v2
        for (int i = 0; i <= 1000; i++) {
            if (i % 7 == 0 && i % 5 == 0) {
                System.out.println("i:" + i);
            }
        }

        // zad 4
        // 

    }
}