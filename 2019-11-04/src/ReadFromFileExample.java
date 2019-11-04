import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileExample {

    public static void main(String[] args) throws IOException {

        final String fileToRead = "file1.txt";
        FileReader fileReader = fileReader = new FileReader(fileToRead);;
        int c = fileReader.read();
        while (c != -1) {
            System.out.println((char) c);
            c = fileReader.read();
        }
    }
}
