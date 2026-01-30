package Searching;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    public static String remove(String str){
        HashSet<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char c: str.toCharArray()){
            if(!set.contains(c)){
                sb.append(c);
                set.add(c);
            }
        }
        return sb.toString();
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of test cases");
        int t=sc.nextInt();
        while(t>0) {
            System.out.println("Enter the string");
            String str = sc.next();
            System.out.println("New String : " + remove(str));
            t--;
        }
    }
}
