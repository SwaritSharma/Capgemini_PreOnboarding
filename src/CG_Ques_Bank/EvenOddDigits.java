package CG_Ques_Bank;

import java.util.Scanner;

public class EvenOddDigits {
    public static void count(int n)
    {
        int e=0,o=0;
        while(n!=0){
            if((n%10)%2==0)e++;
            else o++;
            n=n/10;
        }
        System.out.println("Even digits in the number are : "+e);
        System.out.println("Odds digits in the number are : "+o);
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the number");
            int n=sc.nextInt();
            count(n);
            t--;
        }
    }
}
