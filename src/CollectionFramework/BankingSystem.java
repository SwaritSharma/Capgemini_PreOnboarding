package CollectionFramework;

import java.util.*;

class Account {
    String accNum;
    double balance;

    public Account(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return accNum + " (Balance: $" + balance + ")";
    }
}

public class BankingSystem {
    private Map<String, Account> accounts = new HashMap<>(); 
    private Queue<String> withdrawalRequests = new LinkedList<>(); 

    public void addAccount(String num, double bal) {
        accounts.put(num, new Account(num, bal));
    }

    public void requestWithdrawal(String num) {
        withdrawalRequests.add(num);
    }

    public void processWithdrawals() {
        System.out.println("Processing Withdrawals");
        while (!withdrawalRequests.isEmpty()) {
            String num = withdrawalRequests.poll();
            Account acc = accounts.get(num);
            if (acc != null) {
                System.out.println("Processing account: " + acc);
            }
        }
    }

    public void displaySortedByBalance() {
        System.out.println("\nAccounts Sorted by Balance");
        List<Account> sorted = new ArrayList<>(accounts.values());
        sorted.sort((a, b) -> Double.compare(b.balance, a.balance)); 
        sorted.forEach(System.out::println);
    }

    public static void main(String[] args) {
        BankingSystem bs = new BankingSystem();
        bs.addAccount("A101", 5000);
        bs.addAccount("A102", 2000);
        bs.addAccount("A103", 10000);

        bs.requestWithdrawal("A102");
        bs.requestWithdrawal("A101");

        bs.processWithdrawals();
        bs.displaySortedByBalance();
    }
}
