package CG_Ques_Bank;

import java.util.Scanner;

public class PalindromeNumber
{
    public static boolean palindrome(int n)
    {
        String s=""+n;
        int st=0,end=s.length()-1;
        while(st<=end)
        {
            if(s.charAt(st)!=s.charAt(end))return false;
            st++;
            end--;
        }
        return true;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the Number");
            int n=sc.nextInt();
            System.out.println(palindrome(n)?n+" is a Palindrome Number": n+" is not a Palindrome Number");
            t--;
        }
    }
}
