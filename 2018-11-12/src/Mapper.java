public class Mapper {

    public static Person toPerson(String stringData) {
        String[] data = stringData.split(",");

        Person p = new Person(data[1], data[2], Integer.parseInt(data[3]), data[4], data[5]);
        p.setId(Long.parseLong(data[0]));

        return p;
    }
}
