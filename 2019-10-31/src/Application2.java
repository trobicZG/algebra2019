import java.util.HashMap;

public class Application2 {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 6;

    public static void main(String[] args) {

        // CUBE THROWING

        HashMap<Integer, Integer> counterMap = new HashMap<>();

        for (int i = 0; i < 999; i++) {
            int randomNumber = CubeThrowing.getRandomNumber(MIN_VALUE, MAX_VALUE);

            if (counterMap.containsKey(randomNumber)) {
                counterMap.put(randomNumber, counterMap.get(randomNumber) + 1);
            } else {
                counterMap.put(randomNumber, 1);
            }
        }

        System.out.println(counterMap.toString());
    }
}
