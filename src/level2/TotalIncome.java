package level2;

import java.util.Scanner;
public class TotalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        int bonus = scanner.nextInt();
        int totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + " .Hence Total income is INR " + totalIncome);
        scanner.close();
    }
}
