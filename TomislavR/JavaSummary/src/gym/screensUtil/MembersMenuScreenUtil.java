package gym.screensUtil;

import gym.constants.MembersMenuOptionsConstants;
import gym.constants.OfficesMenuOptionsConstants;

import java.util.HashMap;

public abstract class MembersMenuScreenUtil {

    public static HashMap<Integer, String> getAllowedOptions() {
        HashMap<Integer, String> allowedOptions = new HashMap<>();
        allowedOptions.put(MembersMenuOptionsConstants.NEW_MEMBER_CODE, "New member");
        allowedOptions.put(MembersMenuOptionsConstants.SHOW_ALL_MEMBERS_CODE, "Show all members");

        return allowedOptions;
    }
}
