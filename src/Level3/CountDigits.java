package Level3;

import java.util.Scanner;

public class CountDigits {

    public static void countDigits(int number)
    {
        if (number == 0) {
            System.out.println("Number of Digits = 1");
            return;
        }

        int count = 0;

        if (number < 0) {
            number = -number;
        }

        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Number of Digits = " + count);
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();

        while (t > 0) {
            System.out.println("Enter the number");
            int number = sc.nextInt();
            countDigits(number);
            t--;
        }
    }
}
