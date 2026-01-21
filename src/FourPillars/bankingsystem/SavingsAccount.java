package FourPillars.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE=0.04;

    public SavingsAccount(int accountNumber,String holderName,double balance)
    {
        super(accountNumber,holderName,balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance()*INTEREST_RATE;
    }
    @Override
    public boolean calculateLoanEligibility(double amount) {
        return getBalance() >= amount * 0.5;
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account loan requested: " + amount);
    }
}
