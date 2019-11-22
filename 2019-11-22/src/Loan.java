import java.time.LocalDate;

public class Loan {
    private Long bookId;
    private Long memberId;
    private Long employeeId;
    private LocalDate dateFrom;
    private LocalDate dateUntil;

    public Loan(Long bookId, Long memberId, Long employeeId, LocalDate dateFrom, LocalDate dateUntil) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.employeeId = employeeId;
        this.dateFrom = dateFrom;
        this.dateUntil = dateUntil;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateUntil() {
        return dateUntil;
    }

    public void setDateUntil(LocalDate dateUntil) {
        this.dateUntil = dateUntil;
    }
}
