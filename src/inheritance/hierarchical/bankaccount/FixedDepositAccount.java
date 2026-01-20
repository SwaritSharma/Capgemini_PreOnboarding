package inheritance.hierarchical.bankaccount;

public class FixedDepositAccount  extends BankAccount{
    private int time;
    public FixedDepositAccount(int accountNumber,int balance,int time)
    {
        super(accountNumber,balance);
        this.time=time;
    }

    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
