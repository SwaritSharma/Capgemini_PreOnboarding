package CG_Ques_Bank;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int arr[])
    {
        int st=0,n=arr.length,end=n-1;
        while(st<=end)
        {
            int temp=arr[st];
            arr[st++]=arr[end];
            arr[end--]=temp;
        }
        System.out.println("Array after reversing "+ Arrays.toString(arr));
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter the Array size");
            int n= sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter the element at "+i+" index");
                arr[i]=sc.nextInt();
            }
            reverse(arr);
            t--;
        }
    }
}
