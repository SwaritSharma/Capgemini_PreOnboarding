package Level1;

import java.util.Scanner;

public class Factorial
{
    public static int fact(int n)
    {
        if(n==0)return 1;
        return n*fact(n-1);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter the number ");
            int n=sc.nextInt();
            System.out.println("Factorial of "+n+" is "+fact(n));
            t--;
        }

    }
}
