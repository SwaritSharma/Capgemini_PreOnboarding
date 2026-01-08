package Level3_8_01_2026;

import java.util.Scanner;
public class FrequencyNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] result = findFrequency(text);
        for (String s : result) {
            System.out.println(s);
        }
        sc.close();
    }
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[text.length()];
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] != '0') {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        int validCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0' && chars[i] != ' ') {
                if (chars[i] != '0') {
                    validCount++;
                }
            }
        }
        String[] result = new String[validCount];
        int idx = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[idx++] = chars[i] + ": " + freq[i];
            }
        }
        return result;
    }
}
