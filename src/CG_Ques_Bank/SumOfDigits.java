package CG_Ques_Bank;

import java.util.Scanner;

public class SumOfDigits {
    public static int sum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n % 10;
            n=n/10;
        }
        return sum;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the Number");
            int n=sc.nextInt();
            System.out.println("Sum of digits of the number "+n+" is "+sum(n));
            t--;
        }
    }
}
