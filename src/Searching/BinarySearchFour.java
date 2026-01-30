package Searching;
import java.util.Scanner;

public class BinarySearchFour{

    static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;          // possible answer
                right = mid - 1;    // left side search
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;         // possible answer
                left = mid + 1;    // right side search
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {

            System.out.print("\nEnter size of array for test case " + tc + ": ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " sorted elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter target element: ");
            int target = sc.nextInt();

            int first = findFirst(arr, target);
            int last = findLast(arr, target);

            System.out.println("First occurrence index: " + first);
            System.out.println("Last occurrence index: " + last);
        }

        sc.close();
    }
}
