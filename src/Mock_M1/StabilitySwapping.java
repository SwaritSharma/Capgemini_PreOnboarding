package Mock_M1;

import java.util.Arrays;
import java.util.Scanner;

public class StabilitySwapping {
    public static void swap(int [] arr){
        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array given "+Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr)+" Resultant");
    }
}
