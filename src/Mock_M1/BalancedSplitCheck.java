package Mock_M1;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedSplitCheck {
    public static void split(int n,int arr[]){
        if(n==-1) System.out.println("No "+Arrays.toString(arr));
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]);
            if(i!=n)
                System.out.print(",");
        }
        System.out.println();
        for(int i=n+1;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print(", ");
        }
    }
    public static int check(int[] arr){
        int n=arr.length;
        int total=0;
        for(int i:arr){
            total+=i;
        }
        int prefixSum=0;
        for(int i=0;i<n-1;i++){
            prefixSum+=arr[i];
            total-=arr[i];
            if(prefixSum==total){
                System.out.println("Yes");
                return i;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array given "+ Arrays.toString(arr));
        split(check(arr),arr);

    }
}
