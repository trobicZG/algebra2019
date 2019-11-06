import java.io.*;
import java.util.ArrayList;

public class ReadWriteUtil {

    public static void saveToTxt(Gym gym) throws IOException {
        File file = new File("gyms.txt");
        if (file.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Gym gym1 = Gym.fromString(line);
                gym.setID(gym1.getID()+1);
            }
        }
        else {
            gym.setID(1);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        bufferedWriter.write(gym.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static ArrayList<Gym> toGymsList() throws IOException {
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
