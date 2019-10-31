import java.util.HashMap;

public class Application2 {
    public static void main(String[] args) {
        // CUBE THROWING

        HashMap<Integer, Integer> counterMap = new HashMap<>();

        for (int i = 0; i < 999; i++) {
            int randomNumber = CubeThrowing.getRandomNumber();

            if (counterMap.containsKey(randomNumber)) {
                counterMap.put(randomNumber, counterMap.get(randomNumber) + 1);
            } else {
                counterMap.put(randomNumber, 1);
            }
        }

        System.out.println(counterMap.toString());
    }
}
