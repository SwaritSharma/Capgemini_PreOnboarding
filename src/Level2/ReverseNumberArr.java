package Level2;

import java.util.Scanner;

public class ReverseNumberArr {

    public static void reverseNumber(int number) {

        int temp = number;
        int count = 0;

        if (number == 0) {
            System.out.println("Reversed Number:");
            System.out.print(0);
            return;
        }

        // Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int digits[] = new int[count];
        int index = 0;

        // Store digits (already reversed)
        while (number != 0) {
            digits[index] = number % 10;
            index++;
            number = number / 10;
        }

        System.out.println("Reversed Number:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative number");
            return;
        }

        reverseNumber(number);
        sc.close();
    }
}
