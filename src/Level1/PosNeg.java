package Level1;

import java.util.Scanner;

public class PosNeg
{
    public static void eveOdd(int i)
    {
        if(i%2==0) System.out.println("Element is Positive and Even "+i);
        else System.out.println("Element is Positive and Odd "+i);
    }
    public static void check(int i)
    {
        if(i==0) System.out.println("Element is zero");
        else if(i<0) System.out.println("Element is negative "+i);
        else
        {
            eveOdd(i);
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total count");
        int  n=sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        while(i<n)
        {
            System.out.println("Enter the "+(i+1)+" number");
            arr[i]=sc.nextInt();
            i++;
        }
        for(int j=0;j<n;j++)
        {
            check(arr[j]);
        }
        if(arr[0]==arr[n-1]) System.out.println("First and last element are equal");
        else if(arr[0]>arr[n-1]) System.out.println("First is greater than last element");
        else System.out.println("First is smaller than last element");
    }
}
