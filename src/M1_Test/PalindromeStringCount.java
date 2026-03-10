package M1_Test;

import java.util.Scanner;

public class PalindromeStringCount {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(countPalindrome(str,str.length()));
    }

    private static int countPalindrome(String str, int n) {
        int i=0,count=0;
        while(i<n){
            int j=i;
            while(j<n && str.charAt(j)!=' '){
                j++;
            }
            String t=str.substring(i,j);
            if(isPalindrome(t))count++;
            i=j+1;
        }
        return count;
    }

    private static boolean isPalindrome(String t) {
        int i=0,j=t.length()-1;
        while(i<=j){
            if(t.charAt(i++)!=t.charAt(j--))
                return false;
        }
        return true;
    }

}
