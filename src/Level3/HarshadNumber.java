package Level3;

import java.util.Scanner;

public class HarshadNumber {

    public static void checkHarshad(int number)
    {
        int sum = 0;
        int originalNumber = number;

        if (number <= 0) {
            System.out.println(number + " Is Not a Harshad Number");
            return;
        }

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + digit;
            originalNumber = originalNumber / 10;
        }

        if (number % sum == 0) {
            System.out.println(number + " Is a Harshad Number");
        } else {
            System.out.println(number + " Is Not a Harshad Number");
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();

        while (t > 0) {
            System.out.println("Enter the number");
            int number = sc.nextInt();
            checkHarshad(number);
            t--;
        }
    }
}
