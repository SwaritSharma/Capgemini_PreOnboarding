package Strings;

import java.util.Scanner;

class RemoveSpecificChar {

    static String removeChar(String s, char ch) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch)
                res += s.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.print("Enter Character to Remove: ");
        char ch = sc.next().charAt(0);

        System.out.println("Modified String: " + removeChar(s, ch));
    }
}
