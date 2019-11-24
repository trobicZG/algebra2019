package students;

public abstract class StudentMapper {

    public static Student toStudent(String string) {
        String[] data = string.split(Constants.DATA_SEPARATOR);
        return new Student(
                data[Constants.FIRST_NAME_INDEX],
                data[Constants.LAST_NAME_INDEX],
                Integer.parseInt(data[Constants.AGE_INDEX]),
                Integer.parseInt(data[Constants.GRADE_INDEX]));
    }

    public static String toString(Student student) {
        StringBuilder sb = new StringBuilder();
        sb.append(student.getFirstName());
        sb.append(Constants.DATA_SEPARATOR);
        sb.append(student.getLastName());
        sb.append(Constants.DATA_SEPARATOR);
        sb.append(student.getAge());
        sb.append(Constants.DATA_SEPARATOR);
        sb.append(student.getGrade());

        return sb.toString();
    }
}
