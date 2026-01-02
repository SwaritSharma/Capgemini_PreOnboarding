package level2;

import java.util.Scanner;

class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a  =scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("The Quotient is "+ a/b + " and Remainder is "+ a%b + " of two number " + a + " and " + b);
        scanner.close();
    }
}