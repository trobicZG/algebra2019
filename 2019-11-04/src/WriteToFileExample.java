import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {

    public static void main(String[] args) throws IOException {
        String textToWrite = "Algebra, 2019-11-05";

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("file1.txt", true);

            fileWriter.write(textToWrite);
            //fileWriter.write("\n");
            fileWriter.write(System.lineSeparator());

        } catch (IOException e) {
            System.out.println("Greska kod pisanja u datoteku.");
        } finally {
            fileWriter.close();
        }

        System.out.println("Finished.");

    }

}
