package M1_Test;

import java.util.Scanner;

public class HikeTrail {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(peak(arr,n));
        System.out.println(peak2(arr,n));
    }

    private static int peak2(int[] arr, int n) {
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>arr[mid-1]){
                st=mid+1;
            }
            else{
                end=mid;
            }
        }
        return arr[st];
    }

    private static int peak(int[] arr, int n) {
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

}
