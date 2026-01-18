package Level1_18_01_2026;
class BankAccount {
    static String bankName = "Global Bank";
    static int totalAccounts = 0;
    final String accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    void displayDetails(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount account = (BankAccount) obj;
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + account.accountHolderName);
            System.out.println("Account Number: " + account.accountNumber);
        } else {
            System.out.println("Object is not a BankAccount instance.");
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", "ACC123");
        BankAccount acc2 = new BankAccount("Bob", "ACC456");

        acc1.displayDetails(acc1);
        acc2.displayDetails(acc2);

        BankAccount.getTotalAccounts();
    }
}
