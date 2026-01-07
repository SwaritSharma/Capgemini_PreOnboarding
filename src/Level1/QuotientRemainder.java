package Level1;
import java.util.Scanner;

public class QuotientRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();

        System.out.println("Enter the divisor:");
        int divisor = sc.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient is: " + result[0]);
        System.out.println("Remainder is: " + result[1]);
    }
}
