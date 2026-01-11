package CG_Ques_Bank;

import java.util.Arrays;
import java.util.Scanner;

enum leftOrright{
    left,
    right
}

public class RotateArray {
    public static void rotate(int arr[],leftOrright lr,int pos){
        int n=arr.length;
        System.out.println(Arrays.toString(arr));
        int p=pos % n;
        if(lr==leftOrright.left)
        {
            for(int i=0;i<p;i++){
                int temp=arr[0];
                for(int j=0;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[n-1]=temp;
            }
            System.out.println("Array after rotating left by pos "+pos+" is "+Arrays.toString(arr));
        }
        else if(lr==leftOrright.right){
            for(int i=0;i<p;i++){
                int temp=arr[n-1];
                for(int j=n-1;j>0;j--){
                    arr[j] = arr[j-1];
                }
                arr[0]=temp;
            }
            System.out.println("Array after rotating right by pos "+pos+" is "+Arrays.toString(arr));

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0) {
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++)
            {
                System.out.println("Enter the element at index "+j);
                arr[j] = sc.nextInt();
            }
            System.out.println("Enter left or right for which ever direction rotation is to be done ");
            String dir=sc.next();
            leftOrright lr=leftOrright.valueOf(dir.toLowerCase());

            System.out.println("Enter the positon to rotate the array to "+lr);
            int pos=sc.nextInt();
            rotate(arr,lr,pos);
            t--;
        }
    }
}
