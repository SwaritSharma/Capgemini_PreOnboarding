package Strings;

import java.util.Scanner;

class AnagramCheck {

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int f : freq)
            if (f != 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2))
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are NOT Anagrams");
    }
}
