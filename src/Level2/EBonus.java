package Level2;

import java.util.Scanner;

public class EBonus {
    public static void calculateBonus(double salary[], double service[]) {

        double bonus[] = new double[10];
        double newSalary[] = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {

            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus = totalBonus + bonus[i];
            totalOldSalary = totalOldSalary + salary[i];
            totalNewSalary = totalNewSalary + newSalary[i];
        }

        System.out.println("Total Bonus Paid by Zara = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary[] = new double[10];
        double service[] = new double[10];

        int i = 0;
        while (i < 10) {

            System.out.println("Enter salary of employee " + (i + 1));
            double sal = sc.nextDouble();

            System.out.println("Enter years of service of employee " + (i + 1));
            double yrs = sc.nextDouble();

            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input, enter again");
                continue; // index not increased
            }

            salary[i] = sal;
            service[i] = yrs;
            i++;
        }

        calculateBonus(salary, service);
        sc.close();
    }
}
