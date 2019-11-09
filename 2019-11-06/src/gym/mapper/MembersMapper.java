package gym.mapper;

import gym.constants.ApplicationConstants;
import gym.model.Member;

public abstract class MembersMapper {
    private static final int ID_INDEX = 0;
    private static final int FIRST_NAME_INDEX = 1;
    private static final int LAST_NAME_INDEX = 2;
    private static final int OIB_INDEX = 3;

    public static Member toObject(String fromString) {
        String[] data = fromString.split(ApplicationConstants.DATA_SEPARATOR);
        Member member = new Member();
        member.setId(Integer.parseInt(data[ID_INDEX]));
        member.setFirstName(data[FIRST_NAME_INDEX]);
        member.setLastName(data[LAST_NAME_INDEX]);
        member.setOib(data[OIB_INDEX]);

        return member;
    }
}
