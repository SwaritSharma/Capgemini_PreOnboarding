package Logical;

import java.util.Scanner;

public class BalancedSubArrays {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(count(arr,n));
    }

    private static int count(int[] arr, int n) {
        int count=0;
        for(int i=0;i<n;i++){
            int ce=0,co=0;
            for(int j=i;j<n;j++){
                if(arr[j] % 2==0)ce++;
                else co++;
                if(ce==co)count++;
            }
        }
        return count;
    }
}
