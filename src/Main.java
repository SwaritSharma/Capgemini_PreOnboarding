import Sorting.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));
//        System.out.println();
        Merge.sort(0,arr.length-1,arr);
//        System.out.println();
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
