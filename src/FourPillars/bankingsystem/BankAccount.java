package FourPillars.bankingsystem;

public abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber,String holderName,double balance)
    {
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void depositMoney(double amount)
    {
        if(amount<0)return ;
        balance+=amount;
    }
    public void withdrawMoney(double amount)
    {
        if(balance<amount){
            System.out.println("Insufficient Balance");
            return;
        }
        balance-=amount;
    }
    public abstract double calculateInterest();
}
