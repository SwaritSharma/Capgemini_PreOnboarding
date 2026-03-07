package Mock_M1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OddIndexStability {

    public static void rotate(int []arr){
        ArrayList<Integer> e_IndArr=new ArrayList<>();

        // even indexes wale elements ka array/arraylist bana di
        for(int i=0;i<arr.length;i++){
            if(i % 2==0){
                int val=arr[i];
                e_IndArr.add(val);
            }
        }

        //rotate
        int endInd=e_IndArr.size()-1;
        int last=e_IndArr.get(endInd);

        while(endInd>0){
            e_IndArr.add(endInd,e_IndArr.get(endInd-1));
            endInd--;
        }
        e_IndArr.addFirst(last);

        //merge
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(i % 2==0){
                arr[i]=e_IndArr.get(k++);
            }
        }
    }
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
        rotate(arr);
        System.out.println(Arrays.toString(arr)+" Resultant");
        System.out.println(Arrays.toString(new int[]{50, 20, 10, 40, 30, 60}));
    }
}


