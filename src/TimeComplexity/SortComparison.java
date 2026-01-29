package TimeComplexity;

import java.util.*;

public class SortComparison {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];
        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2)
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] sizes = { 1000, 10000 };
        for (int n : sizes) {
            int[] original = new int[n];
            Random rand = new Random();
            for (int i = 0; i < n; i++)
                original[i] = rand.nextInt(n);

            int[] arr1 = original.clone();
            long start = System.currentTimeMillis();
            bubbleSort(arr1);
            long end = System.currentTimeMillis();
            System.out.println("N: " + n + ", Bubble Sort: " + (end - start) + "ms");

            int[] arr2 = original.clone();
            start = System.currentTimeMillis();
            mergeSort(arr2, 0, n - 1);
            end = System.currentTimeMillis();
            System.out.println("N: " + n + ", Merge Sort: " + (end - start) + "ms");

            int[] arr3 = original.clone();
            start = System.currentTimeMillis();
            quickSort(arr3, 0, n - 1);
            end = System.currentTimeMillis();
            System.out.println("N: " + n + ", Quick Sort: " + (end - start) + "ms");
            System.out.println("-------------------------");
        }
    }
}
