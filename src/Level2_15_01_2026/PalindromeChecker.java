package Level2_15_01_2026;

import java.util.Scanner;

class PalindromeChecker {

    String text;

    boolean isPalindrome() {
        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }

        return text.equals(rev);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PalindromeChecker pc = new PalindromeChecker();
        pc.text = sc.nextLine();

        pc.displayResult();
    }
}
