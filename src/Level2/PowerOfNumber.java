package Level2;

import java.util.Scanner;

public class PowerOfNumber {
    public static int calculatePower(int number, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();

        while (t > 0) {

            System.out.println("Enter the number");
            int number = sc.nextInt();

            System.out.println("Enter the power");
            int power = sc.nextInt();

            if (number <= 0 || power < 0) {
                System.out.println("Please enter positive integer values");
            } else {
                int result = calculatePower(number, power);
                System.out.println(number + " raised to the power " + power + " is " + result);
            }

            t--;
        }
    }
}
