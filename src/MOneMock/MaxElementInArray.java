package MOneMock;

import java.util.Scanner;

public class MaxElementInArray {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []res=max(arr,n);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    private static int[] max(int[] arr, int n) {
        int max=-1;
        int maxInd=-1;
        for(int i=0;i<n;i++){
            maxInd=max<arr[i] ? i : maxInd;
            max= max < arr[i] ? arr[i] : max;
        }
        return new int[]{max,maxInd};
    }
}
