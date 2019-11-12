import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Database {

    private static BufferedReader bufferedReader;

    static {
        try {
            bufferedReader = new BufferedReader(new FileReader("persons.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Database() throws FileNotFoundException {
    }

    public static Person findById(Integer id) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(Constants.DATA_SEPARATOR);

            //if (Integer.parseInt(data[0]) == id) {
            if (data[Constants.ID_INDEX].equals(id.toString())) {
                return Mapper.toPerson(line);
            }
        }
        //return null; DO NOT RETURN NULL VALUES
        throw new NoPersonFoundException(id);
    }

    public static List<Person> findPersonsByPhoneNumber(String phoneNumber) throws IOException {
        String line;
        ArrayList<Person> personArrayList = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");

            //if (Integer.parseInt(data[0]) == id) {
            if (data[Constants.PHONE_NUMBER_INDEX].equals(phoneNumber)) {
                Person p = Mapper.toPerson(line);
                personArrayList.add(p);
            }
        }
        return personArrayList;
    }
}
