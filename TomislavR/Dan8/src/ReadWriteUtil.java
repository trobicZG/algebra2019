import java.io.*;
import java.util.ArrayList;

public class ReadWriteUtil {

    public static void saveToTxt(Gym g) throws IOException {
        File f = new File("gyms.txt");
        int ID;
        if (f.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Gym g1 = Gym.fromString(line);
                g.setID(g1.getID()+1);
            }
        }
        else {
            g.setID(1);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f, true));
        bufferedWriter.write(g.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static ArrayList<Gym> toStudentsList() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("gyms.txt"));
        ArrayList<Gym> gyms = new ArrayList<>();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Gym g = Gym.fromString(line);
            gyms.add(g);
        }
        return gyms;
    }
}
