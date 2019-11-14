package task1;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private Integer age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be 0 or greater.");
        }
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age < o.age) {
            return -1;
        }

        if (this.age > o.age) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
