package TimeComplexity;

import java.util.*;

public class SearchComparison {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = { 1000, 10000, 100000 }; // Using 10^5 for faster demonstration than 10^6
        for (int n : sizes) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = i;
            int target = n - 1;

            long start = System.nanoTime();
            linearSearch(arr, target);
            long end = System.nanoTime();
            double linearTime = (end - start) / 1_000_000.0;

            Arrays.sort(arr); // Ensure sorted for binary search
            start = System.nanoTime();
            binarySearch(arr, target);
            end = System.nanoTime();
            double binaryTime = (end - start) / 1_000_000.0;

            System.out.println("N: " + n);
            System.out.format("Linear Search: %.4f ms\n", linearTime);
            System.out.format("Binary Search: %.4f ms\n", binaryTime);
            System.out.println("-------------------------");
        }
    }
}
