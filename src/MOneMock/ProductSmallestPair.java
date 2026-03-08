package MOneMock;

import java.util.Arrays;
import java.util.Scanner;

public class ProductSmallestPair {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(proSmallestPair(arr,sum,n));
    }

    private static int proSmallestPair(int[] arr, int sum, int n) {
        if(n<2)return-1;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]+arr[i+1]<=sum){
                return arr[i]*arr[i+1];
            }
        }
        return -1;
    }
}
