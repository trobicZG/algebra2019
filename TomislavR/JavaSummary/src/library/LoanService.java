package library;

import java.time.LocalDate;

public class LoanService implements LoanInterface {

    @Override
    public void createLoan(Long bookId, Long memberId, Long employeeId, LocalDate startingDate) {

        LoanDatabase.addNewLoan(new Loan(null, bookId, memberId, employeeId, startingDate, null));
    }

    @Override
    public void completeLoan(Long loanId) {
        LoanDatabase.removeLoan(loanId);
    }

}
