package Searching;

import java.util.Scanner;
public class LinearSearchTwo {

    static String searchSentence(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();
        sc.nextLine();

        for (int tc = 1; tc <= t; tc++) {

            System.out.print("\nEnter number of sentences for test case " + tc + ": ");
            int n = sc.nextInt();
            sc.nextLine();

            String[] sentences = new String[n];

            System.out.println("Enter sentences:");
            for (int i = 0; i < n; i++) {
                sentences[i] = sc.nextLine();
            }

            System.out.print("Enter word to search: ");
            String word = sc.nextLine();

            String result = searchSentence(sentences, word);

            System.out.println("Output for test case " + tc + ": " + result);
        }
    }
}
