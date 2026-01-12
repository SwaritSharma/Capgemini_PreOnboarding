package Strings;

import java.util.Scanner;

class ToggleCase {

    static String toggle(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                res += (char)(ch + 32);
            else if (ch >= 'a' && ch <= 'z')
                res += (char)(ch - 32);
            else
                res += ch;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.println("Toggle Case String: " + toggle(s));
    }
}
