import java.time.LocalDate;
import java.util.List;

public interface LoanInterface {

    Loan createLoan(Long bookId, Long memberId, Long employeeId, LocalDate startingDate);

    List<Loan> completeLoan(Long loanId, List<Loan> loans);

}
