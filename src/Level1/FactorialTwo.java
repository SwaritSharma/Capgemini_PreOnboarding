package Level1;

import java.util.Scanner;

public class FactorialTwo {
    public static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
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
