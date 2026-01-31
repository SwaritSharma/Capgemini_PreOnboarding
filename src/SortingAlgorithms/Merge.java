package SortingAlgorithms;

import java.util.Arrays;

public class Merge {

    public static void merge(int st, int end, int mid, int[] arr) {
        int[] new_arr = new int[end - st + 1];
        int i = 0;
        int left = st;
        int right = mid + 1;
        while (left <= mid && right <= end) {
            new_arr[i++] = arr[left] <= arr[right]
                    ? arr[left++]
                    : arr[right++];
            System.out.println(Arrays.toString(arr));
        }
        while (left <= mid) {
            new_arr[i++] = arr[left++];
            System.out.println(Arrays.toString(arr));
        }
        while (right <= end) {
            new_arr[i++] = arr[right++];
            System.out.println(Arrays.toString(arr));
        }
        for (int k = 0; k < new_arr.length; k++) {
            arr[st + k] = new_arr[k];
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void sort(int st,int end,int []arr){
        if (st >= end) return;

        int mid=st+(end-st)/2;
        sort(st,mid,arr);
        sort(mid+1,end,arr);
        merge(st,end,mid,arr);
    }
}
