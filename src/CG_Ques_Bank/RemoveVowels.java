package CG_Ques_Bank;

import java.util.Scanner;

public class RemoveVowels {
    public static void remove(String str)
    {
        int n=str.length();
        String s="";
        for(int i=0;i<n;i++)
        {
            char c=Character.toLowerCase(str.charAt(i));
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                s+=str.charAt(i);
            }

        }
        System.out.println("String without vowels is :"+s);
    }
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            System.out.println("Enter the String");
            String str=sc.nextLine();
            remove(str);
            t--;
        }
    }
}
