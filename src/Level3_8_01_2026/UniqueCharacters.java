package Level3_8_01_2026;

import java.util.Scanner;
public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char[] unique = findUnique(text);
        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " "); 
        }
        System.out.println(); 
        sc.close();
    }
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static char[] findUnique(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
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
        for (int k = 0; k < uniqueCount; k++) {
            result[k] = temp[k];
        }
        return result;
    }
}
