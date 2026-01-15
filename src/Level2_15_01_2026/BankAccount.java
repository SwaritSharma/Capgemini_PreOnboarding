package Level2_15_01_2026;

import java.util.Scanner;

class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();
        acc.accountHolder = sc.nextLine();
        acc.accountNumber = sc.nextInt();
        acc.balance = sc.nextDouble();

        acc.deposit(2000);
        acc.withdraw(1500);
        acc.displayBalance();
    }
}

