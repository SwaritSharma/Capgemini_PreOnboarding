package Logical;

import java.util.Scanner;

public class StringCompression {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(compress(str));
    }

    private static String compress(String str) {
        StringBuilder res=new StringBuilder();
        int i=0,n=str.length();
        while(i<n){
            int j=i;
            while(j<n && str.charAt(i)==str.charAt(j)){
                j++;
            }
            res.append(str.charAt(i));
            res.append(j-i);
            i=j;
        }
        return res.toString();
    }
}
