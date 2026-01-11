package CG_Ques_Bank;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicates
{
    public static void duplicates(int arr[]){
        int n=arr.length;
        int freq[]=new int[256];
        System.out.print("Duplicates in Array "+ Arrays.toString(arr)+" are :");
        for(int i:arr)
        {
            if(freq[i]!=0) System.out.print(i+",");
            else freq[i]++;
        }
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
            duplicates(arr);
            t--;
        }
    }
}
