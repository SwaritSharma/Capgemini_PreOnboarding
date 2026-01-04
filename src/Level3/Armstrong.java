package Level3;

import java.util.Scanner;

public class Armstrong {

    public static void checkArmstrong(int number)
    {
        int sum = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println(number + " Is an Armstrong Number");
        } else {
            System.out.println(number + " Is Not an Armstrong Number");
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();

        while (t > 0) {
            System.out.println("Enter the number");
            int number = sc.nextInt();
            checkArmstrong(number);
            t--;
        }
    }
}
