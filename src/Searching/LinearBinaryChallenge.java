package Searching;

import java.util.*;

public class LinearBinaryChallenge {

    static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if (val >= 1 && val <= n) {
                arr[val - 1] = -Math.abs(arr[val - 1]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {

            System.out.print("\nEnter size of array for test case " + tc + ": ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] copy = Arrays.copyOf(arr, n);

            int missing = firstMissingPositive(copy);
            System.out.println("First missing positive integer: " + missing);

            Arrays.sort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));

            System.out.print("Enter target to search: ");
            int target = sc.nextInt();

            int index = binarySearch(arr, target);
            System.out.println("Target index (Binary Search): " + index);
        }

        sc.close();
    }
}
