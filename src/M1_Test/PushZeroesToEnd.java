package M1_Test;

import java.util.Arrays;
import java.util.Scanner;

public class PushZeroesToEnd {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(pushZeroes(arr,n)));
    }

    private static int[] pushZeroes(int[] arr, int n) {
        int pos=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[pos++]=arr[i];
            }
        }
        while(pos<n){
            arr[pos++]=0;
        }
        return arr;
    }
}
