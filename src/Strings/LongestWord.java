package Strings;

import java.util.Scanner;

class LongestWord {

    static void findLongest(String s) {
        String[] words = s.split(" ");
        String longest = "";

        for (String w : words) {
            if (w.length() > longest.length())
                longest = w;
        }
        System.out.println("Longest Word: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String s = sc.nextLine();
        findLongest(s);
    }
}
