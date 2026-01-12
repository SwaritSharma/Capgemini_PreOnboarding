package Strings;

import java.util.Scanner;

class MostFrequentChar {

    static void mostFrequent(String s) {
        int max = 0;
        char ans = ' ';

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }
            if (count > max) {
                max = count;
                ans = s.charAt(i);
            }
        }
        System.out.println("Most Frequent Character: " + ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        mostFrequent(s);
    }
}
