package Level3;

import java.util.Scanner;

public class Calculator {

    public static void calculate(double first, double second, String op)
    {
        switch (op) {

            case "+":
                System.out.println("Result = " + (first + second));
                break;

            case "-":
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                System.out.println("Result = " + (first * second));
                break;

            case "/":
                if (second == 0) {
                    System.out.println("Division by zero is not allowed");
                } else {
                    System.out.println("Result = " + (first / second));
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();

        while (t > 0) {

            System.out.println("Enter first number");
            double first = sc.nextDouble();

            System.out.println("Enter second number");
            double second = sc.nextDouble();

            System.out.println("Enter operator (+, -, *, /)");
            String op = sc.next();

            calculate(first, second, op);
            t--;
        }
    }
}
