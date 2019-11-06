package gym.repository;

import gym.constants.ApplicationConstants;

import java.io.*;
import java.util.ArrayList;

public class Repository {
    private static final int ID_INDEX = 0;

    public static int getLatestId(String fileName) throws IOException {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            return 0;
        }

        String line;
        int latestId = 0;
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(ApplicationConstants.DATA_SEPARATOR);
            latestId = Integer.parseInt(data[ID_INDEX]);
        }
        return latestId;
    }

    public static void addNew(String fileName, String dataToWrite) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));

        bufferedWriter.write(dataToWrite);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static ArrayList<String> getAllRows(String fileName) throws IOException {
        ArrayList<String> allRows = new ArrayList<>();
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
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
