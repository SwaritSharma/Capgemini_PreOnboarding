package inheritance.hierarchical.bankaccount;

public class SavingsAccount extends BankAccount {
    private int interestRate;
    SavingsAccount(int accountNumber,int balance,int interestRate)
    {
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Savings");
    }
}
