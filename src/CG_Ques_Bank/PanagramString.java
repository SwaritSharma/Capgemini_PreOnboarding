package CG_Ques_Bank;

import java.util.Scanner;

public class PanagramString {
    public static boolean panagram(String str)
    {
        int yo[]=new int[26];
        String s=str.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)) && yo[s.charAt(i)-'a']==0){
                yo[s.charAt(i)-'a']+=1;
                count++;
            }
        }
        return count==26;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            System.out.println("Enter the String");
            String str=sc.nextLine();
            System.out.println(panagram(str)?str+" is a Panagram String": str+" is not a Panagram String");
            t--;
        }
    }
}
