package task3;

import java.io.*;
import java.util.ArrayList;

public abstract class StudentRepository {

    public static void addStudent(Student student) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(Constants.STUDENTS_FILE_LOCATION, true));

        writer.write(StudentMapper.toString(student));
        writer.newLine();
        writer.close();
    }

    public static ArrayList<Student> getAllStudents() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(Constants.STUDENTS_FILE_LOCATION));

        ArrayList<Student> students = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            students.add(StudentMapper.toStudent(line));
        }

        return students;
    }

}
