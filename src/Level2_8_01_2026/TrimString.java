package Level2_8_01_2026;

import java.util.Scanner;

public class TrimString {

    static int[] trimIndexes(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (s.charAt(start) == ' ')
            start++;

        while (s.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    static String createSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String text = sc.nextLine();

        int[] index = trimIndexes(text);
        String customTrim = createSubstring(text, index[0], index[1]);
        String builtInTrim = text.trim();

        boolean result = compareStrings(customTrim, builtInTrim);

        System.out.println("Custom Trim: [" + customTrim + "]");
        System.out.println("Built-in Trim: [" + builtInTrim + "]");
        System.out.println("Are both equal? " + result);
        sc.close();
    }
}

