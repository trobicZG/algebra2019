package gym.util;

import java.util.HashMap;

public abstract class ValidationUtil {
    public static boolean isValidInput(String option, HashMap<Integer, String> allowedOptionsMap) {
        if (option == null) {
            return false;
        }

        Integer optionInt;
        try {
            optionInt = Integer.parseInt(option);
        } catch (NumberFormatException e) {
            return false;
        }

        if (!allowedOptionsMap.containsKey(optionInt)) {
            return false;
        }

        return true;
    }
}
