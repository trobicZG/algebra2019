public class Application2 {
    public static void main(String[] args) {
        // CUBE THROWING

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;

        for (int i = 0; i < 999; i++) {
            int randomNumber = CubeThrowing.getRandomNumber();

            if (randomNumber == 1) {
                counter1++;
            }

            if (randomNumber == 2) {
                counter2++;
            }

            if (randomNumber == 3) {
                counter3++;
            }

            if (randomNumber == 4) {
                counter4++;
            }

            if (randomNumber == 5) {
                counter5++;
            }

            if (randomNumber == 6) {
                counter6++;
            }

        }

        System.out.println("1: " + counter1);
        System.out.println("2: " + counter2);
        System.out.println("3: " + counter3);
        System.out.println("4: " + counter4);
        System.out.println("5: " + counter5);
        System.out.println("6: " + counter6);

    }
}
