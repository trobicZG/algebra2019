import java.util.Random;

public class CubeThrowing {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 6;

    static int getRandomNumber() {
        Random r = new Random();

        return r.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
    }

}
