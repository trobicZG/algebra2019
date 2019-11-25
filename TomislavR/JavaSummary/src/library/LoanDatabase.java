package library;

import library.Loan;

import java.util.ArrayList;
import java.util.List;

abstract class LoanDatabase {

    private static Long lastSavedId = 0L;
    private static List<Loan> loanList = new ArrayList<>();

    public static void addNewLoan(Loan loan) {
        lastSavedId++;
        loan.setId(lastSavedId);
        loanList.add(loan);
    }

    public static void removeLoan(Long id) {
        for (Loan l : loanList) {
            if (l.getId().equals(id)) {
                loanList.remove(l);
                break;
            }
        }
        System.out.println("a");
    }
}
