package CG_Ques_Bank;

import java.util.Scanner;

public class RemoveSpecialCharacters
{
    public static void remove(String str){
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char c= str.charAt(i);
            if(Character.isLetterOrDigit(c) || Character.isWhitespace(c)){
                System.out.print(c);
            }
        }
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            System.out.println("Enter the String");
            String str= sc.nextLine();
            remove(str);
            t--;
        }
    }
}
