package Logical;

import java.util.Scanner;

public class MaximumSumAfterKOperations {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(maxSum(arr,k,n));
    }

    private static int maxSum(int[] arr, int k, int n) {
        int sum=0,i=0;
        while(i<k){
            int m[]=max(arr,n);
            arr[m[1]]=(int)Math.ceil(m[0] / 3.0);
            sum+=m[0];
            i++;
        }
        return sum;
    }

    private static int[] max(int[] arr, int n) {
        int max=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                idx=i;
            }
            max=max<arr[i] ? arr[i] : max;
        }
        return new int[]{max,idx};
    }
}
