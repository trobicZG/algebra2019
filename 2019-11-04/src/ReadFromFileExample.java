import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileExample {

    public static void main(String[] args) throws IOException {

        final String fileToRead = "file1.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileToRead));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
