package objectmodeling.bankaccount;

public class Account {
    private int accountNumber;
    private int balance;

    public Account(int accountNumber,int balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void depositMoney(int amount)
    {
        if(amount<0)
        {
            System.out.println("Invalid Amount");
            return;
        }
        balance+=amount;
    }
    public void withdrawMoney(int amount)
    {
        if(amount<0 ||balance<amount)
        {
            System.out.println("Insufficient Balance or Invalid Amount");
            return;
        }
        balance-=amount;
    }
}
