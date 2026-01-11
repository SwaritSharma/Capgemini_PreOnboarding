package CG_Ques_Bank;

import java.util.Scanner;

public class ArmstrongNumber {
    public static int count(int n)
    {
        int c=0;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        return c;
    }
    public static boolean armstrong(int n)
    {
        int temp=n;
        int digits=count(n);
        int res=0;
        while(n!=0)
        {
            res+=Math.pow(n%10,digits);
            n=n/10;
        }
        return temp==res;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the Number");
            int n=sc.nextInt();
            System.out.println(armstrong(n)?n+" is an Armstrong Number":n+" is not an Armstrong Number");
            t--;
        }
    }
}
