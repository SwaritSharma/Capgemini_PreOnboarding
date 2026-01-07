package Level2;
import java.util.Scanner;

public class AnalysisOfNum {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            arr[i] = sc.nextInt();

            if (isPositive(arr[i])) {
                if (isEven(arr[i]))
                    System.out.println("Positive Even number");
                else
                    System.out.println("Positive Odd number");
            } else {
                System.out.println("Negative number");
            }
        }

        int result = compare(arr[0], arr[arr.length - 1]);

        if (result == 0)
            System.out.println("First and last elements are equal");
        else if (result == 1)
            System.out.println("First element is greater than last");
        else
            System.out.println("First element is less than last");
    }
}
