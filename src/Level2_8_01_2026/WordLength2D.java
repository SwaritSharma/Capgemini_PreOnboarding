package Level2_8_01_2026;

import java.util.Scanner;

public class WordLength2D {

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

    static String[] splitWords(String text) {
        int len = findLength(text);
        int count = 1;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                count++;

        String[] words = new String[count];
        String word = "";
        int idx = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }
        words[idx] = word;
        return words;
    }

    static String[][] wordWithLength(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = wordWithLength(words);

        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
        }
        sc.close();
    }
}
