import java.util.Random;

public class CubeThrowing {
    static int getRandomNumber() {
        Random r = new Random();

        return r.nextInt((6 - 1) + 1 ) + 1;
    }

}
