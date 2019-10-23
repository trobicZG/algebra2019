public class ArraysTask1 {
    public static void main(String[] args) {

        int numbers[] = new int[100];

        for (int i = 1; i <= 100; i++) {
            numbers[i - 1] = i;
        }

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
