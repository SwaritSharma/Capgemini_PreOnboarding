package GfgSheet;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    static void rotate(int[] arr,int d){
        int r=d % arr.length;
        int n=arr.length;
        while(r>0){
            int st=arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=st;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        rotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }
}
