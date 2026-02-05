package Exception;

import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error");
        } finally {
            System.out.println("Operation completed");
        }
    }
}

