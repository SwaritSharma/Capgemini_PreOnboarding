package Stack_Queue_HashMap_HashingFunction;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : nums)
            map.put(num, true);

        int longest = 0;
        for (int num : nums) {
            if (!map.containsKey(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (map.containsKey(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        System.out.println("Longest streak: " + longestConsecutive(nums));
    }
}
