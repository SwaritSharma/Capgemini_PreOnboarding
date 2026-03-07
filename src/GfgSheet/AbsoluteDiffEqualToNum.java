package GfgSheet;

import java.util.Scanner;

public class AbsoluteDiffEqualToNum {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int diff= sc.nextInt();
        findCount(arr,n,num,diff);
    }

    private static void findCount(int[] arr, int n, int num, int diff) {
        int tc=0;
        for(int i:arr){
            if(Math.abs(num-i)<=diff){
                tc++;
            }
        }
        System.out.println(tc);
    }
}
