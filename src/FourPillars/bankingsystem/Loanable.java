package FourPillars.bankingsystem;

public interface Loanable {
    public void applyForLoan(double amount);
    public boolean calculateLoanEligibility(double amount);
}
