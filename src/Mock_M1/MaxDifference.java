package Mock_M1;

import java.util.Arrays;
import java.util.Scanner;

public class MaxDifference {
    public static void cal(int arr[]){
        int diff=0;
        int i1=-1,j1=-1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]>diff){
                    i1=arr[i];
                    j1=arr[j];
                }
                diff=Math.max(arr[j]-arr[i],diff);
            }
        }
        System.out.println(Arrays.toString(new int[]{i1,j1}));
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
        cal(arr);
        System.out.println("Resultant "+Arrays.toString(arr));
    }
}
