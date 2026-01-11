package CG_Ques_Bank;

import java.util.*;

public class GCD_And_LCM
{
    public static int gcd(int n1,int n2)
    {
        int g=n1>n2?n1:n2;
        int s=n1<n2?n1:n2;
        while(s!=0)
        {
            int q=g % s;
            g=s;
            s=q;
        }
        return g;
    }

    public static int lcm(int n1,int n2)
    {
        if(n1==n2)return n1;
        int max=n1>n2?n1:n2;
        int min=n1<n2?n1:n2;
        int temp=max;
        while(max % min!=0)
        {
            max+=temp;
        }
        return max;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the First Number");
            int n1=sc.nextInt();
            System.out.println("Enter the Second Number");
            int n2=sc.nextInt();
            System.out.println("GCD for "+n1+","+n2+" is : "+gcd(n1,n2));
            System.out.println("LCM for "+n1+","+n2+" is : "+lcm(n1,n2));
            t--;
        }
    }
}
