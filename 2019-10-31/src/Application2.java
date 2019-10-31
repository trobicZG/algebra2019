import java.util.ArrayList;

public class Application2 {
    public static void main(String[] args) {
        // CUBE THROWING

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);

        for (int i = 0; i < 999; i++) {
            int randomNumber = CubeThrowing.getRandomNumber();

            list.set(randomNumber - 1, list.get(randomNumber - 1) + 1);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ": " + list.get(i));
        }


    }
}
