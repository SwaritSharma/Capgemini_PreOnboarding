package M1_Test;

import java.util.Scanner;
public class Anagram {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(anagram(str1,str2)?"Yes":"No");
        System.out.println(anagram1(str1,str2)?"Yes":"No");

    }

    private static boolean anagram1(String str1, String str2) {
        int n=str1.length(),m=str2.length();
        if(n!=m)return false;
        int freq1[]=new int[256];
        int freq2[]=new int[256];
        for(int i=0;i<n;i++){
            freq1[str1.charAt(i)]++;
            freq2[str2.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }

    private static boolean anagram(String str1, String str2) {
        int n=str1.length(),m=str2.length();
        if(n!=m)return false;
        int freq[]=new int[256];
        for(int i=0;i<n;i++){
            freq[str1.charAt(i)]++;
        }
        for(int i=0;i<m;i++){
            freq[str2.charAt(i)]--;
        }
        for(int i:freq){
            if(i!=0)return false;
        }
        return true;
    }

}
