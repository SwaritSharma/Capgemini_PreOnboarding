package CG_Ques_Bank;

import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void cap(String str){
        int n=str.length();
        String s="" ;
        boolean f=true;
        for(int i=0;i<n;i++)
        {
            char curr=str.charAt(i);
            if(f)
                s+=Character.toUpperCase(curr);

            else if(!f)
                s+=curr;

            f=curr==' '?true:false;
        }
        System.out.println("After capitalizing string is : "+s);
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            System.out.println("Enter the String");
            String str= sc.nextLine();
            cap(str);
            t--;
        }
    }
}
