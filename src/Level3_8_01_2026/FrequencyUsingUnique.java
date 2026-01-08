package Level3_8_01_2026;

import java.util.Scanner;
public class FrequencyUsingUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] frequency = findFrequency(text);
        for (String[] row : frequency) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        sc.close();
    }
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == current) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[uniqueCount++] = current;
            }
        }
        char[] result = new char[uniqueCount];
        for (int k = 0; k < uniqueCount; k++)
            result[k] = temp[k];
        return result;
    }
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }
}
