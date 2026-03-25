package Logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StartAndEndWithVowel {
    static void main() {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.next());
        }
        System.out.println(count(al,n));
    }

    private static int count(ArrayList<String> al, int n) {
        int count=0;
        for(String s:al){
            s=s.toLowerCase();
            if( (s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u' )
            && (s.charAt(s.length()-1)=='a' || s.charAt(s.length()-1)=='e' || s.charAt(s.length()-1)=='i' || s.charAt(s.length()-1)=='o' || s.charAt(s.length()-1)=='u')){
                count++;
            }
        }
        return count;
    }
}
