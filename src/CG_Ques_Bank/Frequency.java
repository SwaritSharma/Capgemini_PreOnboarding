package CG_Ques_Bank;

import java.util.Scanner;

public class Frequency {
    public static void freq(String s)
    {
        int f[]=new int[256];
        for(char c:s.toCharArray())
        {
            f[c]++;
        }
        for(int i=0;i<f.length;i++)
        {
            if(f[i]!=0)
            System.out.println("Frequency of "+((char)i)+" is : "+f[i]) ;
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
            freq(s);
            t--;
        }
    }
}
