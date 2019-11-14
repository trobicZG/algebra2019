import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Database {

    private static BufferedReader bufferedReader = new BufferedReader(new FileReader("persons.txt"));

    public Database() throws FileNotFoundException {

    }

    public static Person findById (int id) throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");

            if data[0].equals(id) {

            }
        }
    }

}
