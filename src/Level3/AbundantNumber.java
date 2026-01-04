package Level3;

import java.util.Scanner;

public class AbundantNumber {

    public static void checkAbundant(int number)
    {
        if (number <= 0) {
            System.out.println(number + " Is Not an Abundant Number");
            return;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum > number) {
            System.out.println(number + " Is an Abundant Number");
        } else {
            System.out.println(number + " Is Not an Abundant Number");
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();

        while (t > 0) {
            System.out.println("Enter the number");
            int number = sc.nextInt();
            checkAbundant(number);
            t--;
        }
    }
}
