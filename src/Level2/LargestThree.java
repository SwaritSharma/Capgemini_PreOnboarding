package Level2;

import java.util.Scanner;

public class LargestThree {
    public static void findLargestDigits(int number) {

        int maxDigit = 10;
        int digits[] = new int[maxDigit];
        int index = 0;

        while (number != 0) {

            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                int temp[] = new int[maxDigit];

                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            int digit = number % 10;
            digits[index] = digit;
            index++;

            number = number / 10;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second Largest digit = " + secondLargest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        findLargestDigits(number);
        sc.close();
    }
}
