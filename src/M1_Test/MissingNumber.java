package M1_Test;

import java.util.Scanner;

public class MissingNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(missing(arr,n));
    }

    private static int missing(int[] arr, int n) {
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
