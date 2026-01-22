package objectmodeling.bankaccount;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int age;
    ArrayList<Account>accounts;


    public Customer(String name,int age)
    {
        this.name=name;
        this.age=age;
        accounts=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int viewBalance(int accountNumber)
    {
        boolean found=false;
        for(Account account:accounts)
        {
            System.out.println("Account Number: "+account.getAccountNumber());
            if(account.getAccountNumber()==accountNumber)
            {
                found=true;
                return account.getBalance();
            }

        }
        if(!found) System.out.println("Invalid Account Number");
        return 0;
    }
    public void displayCustomerDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public void addMoney(int accountNumber,int money)
    {
        for(Account account:accounts)
        {
            if(account.getAccountNumber()==accountNumber)
            {
                 account.depositMoney(money);
            }
        }
    }
    public void recieveMoney(int accountNumber,int money)
    {
        for(Account account:accounts)
        {
            if(account.getAccountNumber()==accountNumber)
            {
                account.withdrawMoney(money);
            }
        }
    }
}
