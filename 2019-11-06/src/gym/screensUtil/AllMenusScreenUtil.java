package gym.screensUtil;

import java.util.HashMap;

public class AllMenusScreenUtil {
    public static void showMenu(HashMap<Integer, String> optionsValuesMap) {
        for (int i = 0; i < optionsValuesMap.size(); i++) {
            System.out.println(i + ": " + optionsValuesMap.get(i));
        }
    }
}
