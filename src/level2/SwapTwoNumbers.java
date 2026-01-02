package level2;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("The Swapped numers are " + a + " and " + b);
        scanner.close();
    }
}
