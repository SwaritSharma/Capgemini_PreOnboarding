package Strings;

import java.util.Scanner;

class CountVowelsConsonants {

    static void count(String s) {
        int v = 0, c = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    v++;
                else
                    c++;
            }
        }
        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        count(s);
    }
}
