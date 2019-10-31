import java.util.Random;

public class CubeThrowing {

    private CubeThrowing() {
    }

    private final static Random r = new Random();

    static int getRandomNumber(int min, int max) {
        return r.nextInt((max - min) + 1) + min;
    }

}
