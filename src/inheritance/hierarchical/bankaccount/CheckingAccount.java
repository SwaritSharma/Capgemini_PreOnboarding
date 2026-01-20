package inheritance.hierarchical.bankaccount;

public class CheckingAccount extends BankAccount {
    private int withdrawalLimit;
    CheckingAccount(int accountNumber,int balance,int withdrawalLimit)
    {
        super(accountNumber, balance);
        this.withdrawalLimit=withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Checking Account");
    }
}
