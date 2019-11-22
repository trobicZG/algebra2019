import java.time.LocalDate;

public class LoanService implements LoanInterface {

    @Override
    public Loan createLoan(Long bookId, Long memberId, Long employeeId, LocalDate startingDate) {
        return new Loan(bookId, memberId, employeeId,startingDate, null );
    }

    @Override
    public void completeLoan(Long loanId) {

    }
}
