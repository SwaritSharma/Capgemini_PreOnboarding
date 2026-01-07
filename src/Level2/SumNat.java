package Level2;
import java.util.Scanner;

public class SumNat{

    public static int sumUsingRecursion(int n) {
        if (n == 0) return 0;
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural number:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Not a natural number.");
            return;
        }

        int recSum = sumUsingRecursion(n);
        int formulaSum = sumUsingFormula(n);

        System.out.println("Sum using recursion: " + recSum);
        System.out.println("Sum using formula: " + formulaSum);

        System.out.println("Both results are equal: " + (recSum == formulaSum));
    }
}
