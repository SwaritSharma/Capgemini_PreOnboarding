package Strings;
import java.util.Scanner;

class PalindromeString {

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();

        if (isPalindrome(s))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is NOT Palindrome");
    }
}
