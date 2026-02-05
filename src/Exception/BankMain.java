package Exception;

public class BankMain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        try {
            acc.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

