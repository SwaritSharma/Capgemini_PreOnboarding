package Level1;

import java.util.Scanner;

public class EvenOdd {
    public static void eveOdd(int n)
    {
        if(n<0) {
            System.out.println("Negative Number");
            return;
        }
        int x=1;
        while(x<=n)
        {
            System.out.println((x % 2==0 ? x+" Is Even Number": x+" Is Odd Number"));
            x++;
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of test cases");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter the number");
            int n=sc.nextInt();
            eveOdd(n);
            t--;
        }

    }
}
