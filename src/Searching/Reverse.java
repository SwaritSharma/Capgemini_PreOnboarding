package Searching;

import java.util.Scanner;

public class Reverse {
    public static String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of test cases");
        int t=sc.nextInt();
        while(t>0) {
            System.out.println("Enter the string to reverse");
            String str = sc.next();
            System.out.println("Reversed String : " + reverse(str));
            t--;
        }
    }
}
