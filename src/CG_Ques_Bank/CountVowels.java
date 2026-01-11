package CG_Ques_Bank;

import java.util.Scanner;

public class CountVowels {
    public static int count(String s)
    {
        int c=0;
        for(char ch:s.toCharArray())
        {
            ch=Character.toLowerCase(ch);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                c++;
            }
        }
        return c;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the String");
            String str= sc.next();
            System.out.println("Number of vowels in String "+str+" : "+count(str));
            t--;
        }
    }
}
