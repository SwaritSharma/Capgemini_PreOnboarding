package Level3;

import java.util.Scanner;

public class NumberChecker6 {

    static int countFactors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) c++;
        }
        return c;
    }

    static int[] getFactors(int n) {
        int count = countFactors(n);
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[idx++] = i;
        }
        return factors;
    }

    static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int x : factors) if (x > max) max = x;
        return max;
    }

    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int x : factors) sum += x;
        return sum;
    }

    static long productOfFactors(int[] factors) {
        long prod = 1;
        for (int x : factors) prod *= x;
        return prod;
    }

    static double cubeProductOfFactors(int[] factors) {
        double prod = 1;
        for (int x : factors) prod *= Math.pow(x, 3);
        return prod;
    }

    static boolean isPerfect(int n, int[] factors) {
        int sum = 0;
        for (int x : factors) if (x != n) sum += x;
        return sum == n;
    }

    static boolean isAbundant(int n, int[] factors) {
        int sum = 0;
        for (int x : factors) if (x != n) sum += x;
        return sum > n;
    }

    static boolean isDeficient(int n, int[] factors) {
        int sum = 0;
        for (int x : factors) if (x != n) sum += x;
        return sum < n;
    }

    static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] factors = getFactors(number);

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Cube Product of Factors: " + cubeProductOfFactors(factors));

        System.out.println("Perfect Number: " + isPerfect(number, factors));
        System.out.println("Abundant Number: " + isAbundant(number, factors));
        System.out.println("Deficient Number: " + isDeficient(number, factors));
        System.out.println("Strong Number: " + isStrong(number));
    }
}
