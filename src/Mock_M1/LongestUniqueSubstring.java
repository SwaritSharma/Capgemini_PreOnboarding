package Mock_M1;

import java.util.HashSet;
import java.util.Scanner;

public class LongestUniqueSubstring {
    public static void unique(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int maxLen = 0, start = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
            right++;
        }
        String res = s.substring(start, start + maxLen);
        System.out.println(res+" "+res.length());
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        unique(s);
    }
}
