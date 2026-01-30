package Searching;

import java.util.Scanner;

public class BinarySearchTwo {
    static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            boolean leftOk = (mid == 0) || arr[mid] > arr[mid - 1];
            boolean rightOk = (mid == arr.length - 1) || arr[mid] > arr[mid + 1];

            if (leftOk && rightOk) {
                return mid;
            }

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
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

            int index = findPeak(arr);

            System.out.println("Peak element index: " + index);
            System.out.println("Peak element value: " + arr[index]);
        }

        sc.close();
    }
}
