package CG_Ques_Bank;

import java.util.Scanner;

public class ReverseWords
{
    public static String reverse(String s)
    {
        String sen[]=s.split(" ");
        String rev="";
        for(int i=0;i<sen.length;i++)
        {
            StringBuilder curr=new StringBuilder(sen[i]);
            rev+=curr.reverse();
            if(i!=sen.length-1)rev+=" ";
        }
        return rev;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            System.out.println("Enter the String");
            String str= sc.nextLine();
            System.out.println("Reversed String for "+str+" : "+reverse(str));
            t--;
        }
    }
}
