package ZAD3B;

public class Student implements Comparable<Student> {
    private int numberOfIndex;
    private String name;
    private String surname;
    private String address;
    private double averageGrade;

    public Student(int numberOfIndex, String name, String surname, String address, double averageGrade) {
        this.numberOfIndex = numberOfIndex;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.averageGrade = averageGrade;
    }

    public int getNumberOfIndex() {
        return numberOfIndex;
    }

    public void setNumberOfIndex(int numberOfIndex) {
        this.numberOfIndex = numberOfIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(Student o) {
        if (this.averageGrade < o.averageGrade) {
            return -1;
        }

        if (this.averageGrade > o.averageGrade) {
            return 1;
        }

        return 0;
    }
}
