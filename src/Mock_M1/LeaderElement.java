package Mock_M1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LeaderElement {
    static int[] leader(int arr[]) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            boolean f=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j])
                {
                    f=false;
                }
            }
            if(f)al.add(arr[i]);
        }
        al.add(arr[arr.length-1]);
        int res[]=new int[al.size()];
        int j=0;
        for(int i:al){
            res[j++]=i;
        }
        return res;
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
        System.out.println(Arrays.toString(leader(arr)));
    }
}
