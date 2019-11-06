package gym.screensUtil;

import gym.constants.OfficesMenuOptionsConstants;

import java.util.HashMap;

public class OfficesMenuScreenUtil {

    public static HashMap<Integer, String> getAllowedOptions() {
        HashMap<Integer, String> allowedOptions = new HashMap<>();
        allowedOptions.put(OfficesMenuOptionsConstants.NEW_OFFICE_CODE, "New office");
        allowedOptions.put(OfficesMenuOptionsConstants.SHOW_ALL_OFFICES, "Show all offices");

        return allowedOptions;
    }
}
