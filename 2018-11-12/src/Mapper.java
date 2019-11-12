public abstract class Mapper {

    public static Person toPerson(String stringData) {
        String[] data = stringData.split(Constants.DATA_SEPARATOR);

        Person p = new Person(data[Constants.FIST_NAME_INDEX], data[Constants.LAST_NAME_INDEX],
                Integer.parseInt(data[Constants.AGE_INDEX]), data[Constants.ADDRESS_INDEX],
                data[Constants.PHONE_NUMBER_INDEX]);
        p.setId(Long.parseLong(data[Constants.ID_INDEX]));

        return p;
    }
}
