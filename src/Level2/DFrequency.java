package Level2;

import java.util.Scanner;

public class DFrequency {
    public static void findFrequency(int number) {

        int temp = number;
        int count = 0;

        // Special case for 0
        if (number == 0) {
            System.out.println("Digit 0 frequency = 1");
            return;
        }

        // Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int digits[] = new int[count];
        int index = 0;

        // Store digits in array
        while (number != 0) {
            digits[index] = number % 10;
            index++;
            number = number / 10;
        }

        // Frequency array for digits 0–9
        int frequency[] = new int[10];

        // Calculate frequency
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " frequency = " + frequency[i]);
            }
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

        findFrequency(number);
        sc.close();
    }

}
