public class Member extends LibraryPersonAbstract {
    public Member(Long id, String fName, String lName, Integer age) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }
}
