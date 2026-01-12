package Strings;

import java.util.Scanner;

class ReplaceWord {

    static String replace(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String res = "";

        for (String w : words) {
            if (w.equals(oldWord))
                res += newWord + " ";
            else
                res += w + " ";
        }
        return res.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter Word to Replace: ");
        String oldWord = sc.next();
        System.out.print("Enter New Word: ");
        String newWord = sc.next();

        System.out.println("Modified Sentence: " +
                replace(sentence, oldWord, newWord));
    }
}
