package Level3;
import java.util.Scanner;

public class NumberChecker {

    static int countDigits(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    static int[] getDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    static boolean isArmstrong(int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        int num = 0;
        for (int d : digits) num = num * 10 + d;
        return sum == num;
    }

    static int[] largestTwo(int[] digits) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max) {
                second = d;
            }
        }
        return new int[]{max, second};
    }

    static int[] smallestTwo(int[] digits) {
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min) {
                second = min;
                min = d;
            } else if (d < second && d != min) {
                second = d;
            }
        }
        return new int[]{min, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Duck Number: " + isDuck(digits));
        System.out.println("Armstrong Number: " + isArmstrong(digits));

        int[] large = largestTwo(digits);
        System.out.println("Largest: " + large[0] + " Second Largest: " + large[1]);

        int[] small = smallestTwo(digits);
        System.out.println("Smallest: " + small[0] + " Second Smallest: " + small[1]);
    }
}
