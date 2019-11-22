import java.time.LocalDate;

public interface LoanInterface {

    Loan createLoan(Long bookId, Long memberId, Long employeeId, LocalDate startingDate);

    void completeLoan(Long loanId);

}
