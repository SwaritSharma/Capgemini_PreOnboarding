package CG_Ques_Bank;

import java.util.Scanner;

public class SumOfEvenPos {
    public static void sum(int n)
    {
        int pos=1,sum=0,d=0,temp=n;
        while(temp!=0){
            d++;
            temp/=10;
        }
        d=d-1;
        while(n!=0)
        {
            int div=(int)Math.pow(10,d);
            int curr=n / div;
            if(pos % 2==0)
            {
                sum+=curr;
            }
            n=n%div;
            pos++;
            d--;
        }
        System.out.println("Sum of digits at even Pos is : "+sum);
    }
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            System.out.println("Enter the Number");
            int n=sc.nextInt();
            sum(n);
            t--;
        }
    }
}
