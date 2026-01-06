package Level1;

import java.util.Scanner;

public class FizzBuzzArr {

    public static void fizzBuzz(int number) {

        String result[] = new String[number + 1];

        for (int i = 0; i <= number; i++) {

            if (i == 0) {
                result[i] = "0";
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                result[i] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                result[i] = "Fizz";
            }
            else if (i % 5 == 0) {
                result[i] = "Buzz";
            }
            else {
                result[i] = String.valueOf(i);
            }
        }

        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            return;
        }

        fizzBuzz(number);
        sc.close();
    }
}
