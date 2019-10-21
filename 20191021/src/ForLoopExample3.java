public class ForLoopExample3 {
    // Napisati program koji ispisuje sve troznamenkaste brojeve djeljive sa 7.
    public static void main(String[] args) {

        for (int i = 100; i <= 999; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
