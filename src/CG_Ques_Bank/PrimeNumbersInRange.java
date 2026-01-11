package CG_Ques_Bank;

import java.util.Scanner;

public class PrimeNumbersInRange {

    public static boolean check(int no)
    {
        for(int i=2;i<=no/2;i++)
        {
            if(no % i==0)return false;
        }
        return true;
    }
    public static void prime(int n)
    {
        System.out.print("Prime Numbers in the range from 1 to "+n+" are ");
        for(int i=2;i<=n;i++)
        {
            if(check(i))
                System.out.print(i+" ");
        }
    }
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the range end");
            int n=sc.nextInt();
            prime(n);
            t--;
        }
    }
}
