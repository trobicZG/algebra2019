package gym.screensUtil;

import java.util.HashMap;

import static gym.constants.MainMenuOptionsConstants.*;

public abstract class MainMenuScreenUtil {

    public static HashMap<Integer, String> getAllowedOptions() {
        HashMap<Integer, String> allowedOptions = new HashMap<>();
        allowedOptions.put(EXIT_CODE, "Exit");
        allowedOptions.put(OFFICES_CODE, "Offices");
        allowedOptions.put(MEMBERS_CODE, "Members");
        allowedOptions.put(MEMBERSHIPS_CODE, "Memberships");
        allowedOptions.put(EQUIPMENTS_CODE, "Equipment");

        return allowedOptions;
    }
}
