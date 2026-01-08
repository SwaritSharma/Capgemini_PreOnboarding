package Level3_8_01_2026;

import java.util.Scanner;
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] frequency = findFrequency(text);
        for (String[] row : frequency) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        sc.close();
    }
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int uniqueCount = 0;
        boolean[] visited = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0 && !visited[c]) {
                uniqueCount++;
                visited[c] = true;
            }
        }
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        visited = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0 && !visited[c]) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                visited[c] = true;
                index++;
            }
        }
        return result;
    }
}
