package Searching;

import java.util.Scanner;

public class BinarySearchOne {

    static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {

            System.out.print("\nEnter size of array for test case " + tc + ": ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements (rotated sorted array):");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int index = findRotationPoint(arr);

            System.out.println("Rotation point index: " + index);
            System.out.println("Smallest element: " + arr[index]);
        }

        sc.close();
    }
}
