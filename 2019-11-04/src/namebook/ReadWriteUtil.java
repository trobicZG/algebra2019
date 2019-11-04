package namebook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteUtil {

    public static void saveToTxt(Student s) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("students.txt", true));
        bufferedWriter.write(s.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static ArrayList<Student> toStudentsList() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"));
        ArrayList<Student> students = new ArrayList<>();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Student s = Student.fromString(line);
            students.add(s);
        }
        return students;
    }
}