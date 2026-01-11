package CG_Ques_Bank;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int n)
    {
        if(n<=1) System.out.println(0);
        else if(n==2) System.out.println(0+" "+1);
        else{
            int f=0;
            int s=1;
            System.out.print(f+" ");
            System.out.print(s+" ");
            for(int i=3;i<=n;i++)
            {
                int new_s=f+s;
                System.out.print(new_s+" ");
                f=s;
                s=new_s;
            }
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the Nth term");
            int n=sc.nextInt();
            fibonacci(n);
            t--;
        }
    }
}
