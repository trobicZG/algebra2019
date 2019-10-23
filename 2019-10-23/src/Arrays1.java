public class Arrays1 {

    public static void main(String[] args) {
        int[] numbers = new int[20];

        for (int i = 1; i<=20; i++) {
            numbers[i-1] = i;
        }

        for (int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("---------------------------------");

        for (int n : numbers) {
            System.out.println(n);

        }

    }
}
