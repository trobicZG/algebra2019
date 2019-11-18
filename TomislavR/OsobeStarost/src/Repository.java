import java.io.*;
import java.util.ArrayList;

public class Repository {
    private static final int ID_INDEX = 0;
    private static final String FILE = "students.txt";

    public static void addNew(String dataToWrite) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE, true));

        bufferedWriter.write(dataToWrite);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static ArrayList<String> getAllRows() throws IOException {
        ArrayList<String> allRows = new ArrayList<>();
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(FILE));
        } catch (FileNotFoundException e) {
            return allRows;
        }

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            allRows.add(line);
        }

        return allRows;
    }
}
