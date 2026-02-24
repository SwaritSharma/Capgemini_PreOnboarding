package Mock_M1;

import java.util.Scanner;

public class CompressString {
    public static void compress(String s){
        String res="";
        int i=0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            int c = 0;

            while (i < s.length() && s.charAt(i) == ch) {
                c++;
                i++;
            }
            res += ch;
            res += c;
        }

        System.out.println(res);

    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        compress(s);
    }
}
