import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Database {

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

    public static Person findById(int id) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");

            if (data[0].equals(id)) {
                return Mapper.toPerson(line);
            }
        }
        throw new NoPersonFoundException(id);
    }

    public static List<Person> findPersonsByPhoneNumber(String phoneNumber) {
        return null;
    }
}
