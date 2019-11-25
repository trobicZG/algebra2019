package library;

public class Employee extends LibraryPersonAbstract {

    public Employee(Long id, String fName, String lName, Integer age) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }
}
