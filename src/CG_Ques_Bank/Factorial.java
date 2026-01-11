package CG_Ques_Bank;

import java.util.Scanner;

public class Factorial
{
    public static void fact(int n){
        System.out.print("Factorial of "+n+" is :");
        if(n==0) System.out.print('1');
        int f=1;
        while(n!=1){
            f*=n;
            n--;
        }
        System.out.print(f);
    }
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the number");
            int n=sc.nextInt();
            fact(n);
            t--;
        }
    }
}
