public class ForLoopExample2 {
    // Napisati program koji zbraja sve prirodne dvoznamenkaste brojeve
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            sum += i; // sum = sum + i
        }

        System.out.println("sum: " + sum);

    }
}
