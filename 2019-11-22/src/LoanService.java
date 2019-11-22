import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class LoanService implements LoanInterface {

    @Override
    public Loan createLoan(Long bookId, Long memberId, Long employeeId, LocalDate startingDate) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long miliseconds = System.currentTimeMillis();
        return new Loan(miliseconds, bookId, memberId, employeeId, startingDate, null);
    }

    @Override
    public List<Loan> completeLoan(Long loanId, List<Loan> loans) {
        for (Loan l : loans) {
            if (l.getId().equals(loanId)) {
                loans.remove(l);
                break;
            }
        }
        return loans;
    }


}
