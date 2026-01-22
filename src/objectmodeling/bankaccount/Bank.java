package objectmodeling.bankaccount;

import java.util.ArrayList;

public class Bank {
    private int accountNumber=1000;
    private String bankName;
    ArrayList<Customer>customers;

    public  Bank(String bankName)
    {
        this.bankName=bankName;
        customers=new ArrayList<>();
    }

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }
    public void removeCustomer(Customer customer)
    {
        customers.remove(customer);
    }
    public void openAccount(Customer customer){
            if(customer.getAge()<15)
            {
                System.out.println("Child cannot open an account");
                return ;
            }
            customer.accounts.add(new Account(accountNumber++,0));
            addCustomer(customer);
    }

}
