package Stack_Queue_HashMap_HashingFunction;

import java.util.HashMap;

public class PairWithSum {
    public static boolean hasPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            if (map.containsKey(target - x)) {
                System.out.println("Pair found: " + (target - x) + ", " + x);
                return true;
            }
            map.put(x, 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 16;
        if (!hasPair(arr, target)) {
            System.out.println("No pair found");
        }
    }
}
