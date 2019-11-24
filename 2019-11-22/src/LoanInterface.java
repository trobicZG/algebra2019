import java.time.LocalDate;
import java.util.List;

public interface LoanInterface {

    void createLoan(Long bookId, Long memberId, Long employeeId, LocalDate startingDate);

    void completeLoan(Long loanId);

}
