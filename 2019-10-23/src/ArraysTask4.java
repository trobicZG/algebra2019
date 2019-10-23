import java.util.Random;

public class ArraysTask4 {
    public static void main(String[] args) {

        int numbers[] = new int[10];

        Random random = new Random();

        for (int i = 1; i <= numbers.length; i++) {
            int r = 0;
            while (r == 0) {
                r = random.nextInt(6);
            }
            numbers[i - 1] = r;
        }

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
