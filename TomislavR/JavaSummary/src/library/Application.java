package library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        List<Book> books = new ArrayList<>();

        Author author1 = new Author("Pero", "Peric");
        Author author2 = new Author("Ivana", "Ivanic");

        List<Author> authors1 = new ArrayList<>();
        authors1.add(author1);

        List<Author> authors2 = new ArrayList<>();
        authors2.add(author2);

        members.add(new Member(1L, "Sasa", "Fajkovic", 30));
        members.add(new Member(2L, "Maja", "Majic", 20));

        employees.add(new Employee(1L, "Ivan", "Ivic", 50));

        books.add(new Book(1L, "Prva knjiga", authors1));
        books.add(new Book(2L, "Druga knjiga", authors2));

        LoanService loanService = new LoanService();
        loanService.createLoan(books.get(0).getId(), members.get(0).getId(), employees.get(0).getId(), LocalDate.now());
        loanService.createLoan(books.get(1).getId(), members.get(0).getId(), employees.get(0).getId(), LocalDate.now());
        loanService.createLoan(books.get(0).getId(), members.get(1).getId(), employees.get(0).getId(), LocalDate.now());

        loanService.completeLoan(3L);

        loanService.createLoan(books.get(1).getId(), members.get(1).getId(), employees.get(0).getId(), LocalDate.now());
    }
}
