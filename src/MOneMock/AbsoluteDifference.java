package MOneMock;

import java.util.Scanner;

public class AbsoluteDifference {

    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int num=sc.nextInt(),diff=sc.nextInt();

        System.out.println(findCount(arr,num,diff,n));
    }

    private static int findCount(int[] arr, int num, int diff, int n) {
        int count=0;

        for(int i=0;i<n;i++){
            if(Math.abs(arr[i]-num)<=diff){
                count++;
            }
        }

        return count==0 ? -1:count;
    }
}
