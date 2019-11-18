public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private int grade;
    public final static String DATA_SEPARATOR = ",";

    public Person() {
    }

    public Person(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age) {
            return 1;
        }

        if (this.age < o.age) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return this.getName() + DATA_SEPARATOR +
                this.getAge() + DATA_SEPARATOR +
                this.getGrade();
    }

    public static Person mapper(String personString) {
        Person person = new Person();
        String[] data = personString.split(DATA_SEPARATOR);
        person.setName(data[0]);
        int age = Integer.parseInt(data[1]);
        person.setAge(age);
        int grade = Integer.parseInt(data[2]);
        person.setGrade(grade);

        return person;
    }
}
