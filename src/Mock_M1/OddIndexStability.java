package Mock_M1;

import java.util.Arrays;
import java.util.Scanner;

public class OddIndexStability {
    public static void rotateEven(int []arr){
        int n=arr.length;
        int j=(n-1)%2==0?n-1:n-2;
        int temp=arr[j];
        for(int i=j;i>0;i-=2){
            arr[i]=arr[i-2];
        }
        arr[0]=temp;
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
        System.out.println("Array given "+ Arrays.toString(arr));
        rotateEven(arr);
        System.out.println(Arrays.toString(arr)+" Resultant");
        System.out.println(Arrays.toString(new int[]{50, 20, 10, 40, 30, 60}));
    }
}
