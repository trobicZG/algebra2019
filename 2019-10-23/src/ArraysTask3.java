public class ArraysTask3 {
    public static void main(String[] args) {

        int primeNumbers[] = new int[50];

        int numberCounter = 1;
        int primeCounter = 1;
        while (primeCounter <= 50) {

            int divisionCounter = 0;
            for (int i = 1; i <= numberCounter; i++) {
                if (numberCounter % i == 0) {
                    divisionCounter++;
                }
            }

            if (divisionCounter == 2) {
                primeNumbers[primeCounter-1] = numberCounter;
                primeCounter++;
            }

            numberCounter++;
        }

        for (int n : primeNumbers) {
            System.out.println(n);
        }
    }
}
