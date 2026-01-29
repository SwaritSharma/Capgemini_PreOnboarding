package Stack_Queue_HashMap_HashingFunction;

import java.util.*;

public class SubarrayZeroSum {
    public static void findSubarrays(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                count += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        System.out.println("Total zero-sum subarrays: " + count);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        findSubarrays(arr);
    }
}
