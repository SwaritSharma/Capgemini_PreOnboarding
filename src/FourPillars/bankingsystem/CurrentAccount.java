package FourPillars.bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.02;

    public CurrentAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account loan requested: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return getBalance() >= amount;
    }
}
