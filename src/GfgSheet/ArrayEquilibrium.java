package GfgSheet;

import java.util.Scanner;

public class ArrayEquilibrium {
    static void equilibrium(int[] arr,int n) {
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }
        int prefixSum=0;
        for(int i=0;i<n;i++){
            if(prefixSum==totalSum-arr[i]-prefixSum){
                System.out.println(i);
                return;
            }
            prefixSum+=arr[i];
        }
        System.out.println(-1);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        equilibrium(arr,n);
    }
}
