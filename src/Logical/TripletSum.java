package Logical;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        System.out.println(countTriplets(arr,n,d));
    }

    private static int countTriplets(int[] arr, int n, int d) {
        int count=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if((arr[i]+arr[j]+arr[k])%d==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
