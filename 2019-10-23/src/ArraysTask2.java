public class ArraysTask2 {
    public static void main(String[] args) {

        int numbers[] = new int[40];

        for (int i = 1; i <= 40; i++) {
            numbers[i - 1] = i * i;
        }

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
