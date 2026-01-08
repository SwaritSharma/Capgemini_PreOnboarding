package Level2_8_01_2026;

import java.util.Scanner;

public class StringLength {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println(customLength);
        System.out.println( builtInLength);
        sc.close();
    }
}
