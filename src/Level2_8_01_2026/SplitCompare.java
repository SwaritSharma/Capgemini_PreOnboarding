package Level2_8_01_2026;

import java.util.Scanner;

public class SplitCompare {

    static int findLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
            return c;
        }
    }

    static String[] customSplit(String text) {
        int len = findLength(text);
        int words = 1;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                words++;

        int[] spaceIndex = new int[words + 1];
        int idx = 1;
        spaceIndex[0] = -1;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                spaceIndex[idx++] = i;

        spaceIndex[idx] = len;

        String[] result = new String[words];

        for (int i = 0; i < words; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++)
                word += text.charAt(j);
            result[i] = word;
        }
        return result;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println(compareArrays(custom, builtIn));
        sc.close();
    }
}
