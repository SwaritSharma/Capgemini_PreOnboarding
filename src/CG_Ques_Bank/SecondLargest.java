package CG_Ques_Bank;

import java.util.Scanner;

public class SecondLargest {
    public static int secondLargest(int arr[],int n)
    {
        int max=arr[0];
        int smax=-1;
        for(int i=1;i<n;i++)
        {
            if(max<arr[i]) {
                smax = max;
                max = arr[i];
            }
        }
        return smax;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the Array length");
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.print("Enter the number");
                arr[i]=sc.nextInt();
            }
            System.out.println("Second Largest Number in the array is "+secondLargest(arr,n));
            t--;
        }
    }
}
