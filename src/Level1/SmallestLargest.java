package Level1;
import java.util.Scanner;

public class SmallestLargest {

    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter third number:");
        int c = sc.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);

        System.out.println("Smallest number is: " + result[0]);
        System.out.println("Largest number is: " + result[1]);
    }
}
