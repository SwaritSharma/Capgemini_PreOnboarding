package CG_Ques_Bank;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissing {
    public static void find(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                System.out.println("Missing Number in the array is : "+(i+1));
                return;
            }
        }
        System.out.println("Missing Number is "+(n+1));
    }
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            System.out.println("Enter the Array Length");
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the Number : ");
                arr[i]=sc.nextInt();
            }
            find(arr);
            t--;
        }
    }
}
