package gym.mapper;

import gym.constants.ApplicationConstants;
import gym.model.Office;

public class OfficeMapper {

    private static final int ID_INDEX = 0;
    private static final int CITY_INDEX = 1;
    private static final int ADDRESS_INDEX = 2;
    private static final int WORKING_HOURS_INDEX = 3;
    private static final int CONTACT_PHONE_INDEX = 4;


    public static Office toObject(String string) {
        Office office = new Office();
        String[] data = string.split(ApplicationConstants.DATA_SEPARATOR);

        office.setId(Integer.parseInt(data[ID_INDEX]));
        office.setCity(data[CITY_INDEX]);
        office.setAddress(data[ADDRESS_INDEX]);
        office.setWorkingHours(data[WORKING_HOURS_INDEX]);
        office.setContactNumber(data[CONTACT_PHONE_INDEX]);

        return office;
    }
}
