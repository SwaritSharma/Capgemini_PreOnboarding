package Level2;

import java.util.Scanner;

public class Bonus {
    public static double calculateBonus(double salary, int years) {
        if (years > 5) {
            return salary * 0.05;
        }
        return 0.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees:");
        int t = sc.nextInt();
        while (t > 0) {
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter years of service: ");
            int years = sc.nextInt();
            double bonus = calculateBonus(salary, years);
            if (bonus > 0) {
                System.out.println("Bonus amount = " + bonus);
            } else {
                System.out.println("No bonus");
            }
            t--;
        }
    }
}
