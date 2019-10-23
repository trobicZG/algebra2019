import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(10);

        //list.remove(0);

        //list.clear();

        Collections.sort(list);

        int[] numbers = {5,7,2,6,1};

        Arrays.sort(numbers);
    }
}
