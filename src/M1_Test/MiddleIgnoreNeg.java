package M1_Test;

import java.util.Scanner;

public class MiddleIgnoreNeg {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMid(arr, n));
    }

    private static int findMid(int[] arr, int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                count++;
            }
        }
        int mid = (count - 1) / 2;
        int index = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                if(index == mid){
                    return arr[i];
                }
                index++;
            }
        }
        return -1;
    }
}