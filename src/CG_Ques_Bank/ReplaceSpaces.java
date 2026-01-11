package CG_Ques_Bank;

import java.util.Scanner;

public class ReplaceSpaces {
    public static void replaceWith(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ') System.out.print("-");
            else System.out.print(s.charAt(i));
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            System.out.println("Enter the String");
            String s=sc.nextLine();
            replaceWith(s);
            t--;
        }
    }
}
