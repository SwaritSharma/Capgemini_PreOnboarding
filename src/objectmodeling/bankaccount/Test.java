package objectmodeling.bankaccount;

public class Test {
    static void main() {
//        Customer c1=new Customer("John",12);
        Customer c2=new Customer("Sam",35);
        Bank b1=new Bank("HDFC");
//        b1.openAccount(c1);
        b1.openAccount(c2);
        c2.addMoney(1000,500);
        System.out.println("Balance of C2: "+c2.viewBalance(1000));
    }
}
