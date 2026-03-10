package M1_Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Duplicates {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(remove(arr,n)));
        System.out.println(Arrays.toString(remove1(arr,n)));
    }

    private static int[] remove1(int[] arr, int n) {
        Arrays.sort(arr);
        int i=0;
        int k=0;
        while(i<n){
            int j=i;
            while(j<n && arr[j]==arr[i]){
                j++;
            }
            if(j<n) {
                arr[k+1] = arr[j];
                k++;
            }
            i=j;
        }
        return arr;
    }

    private static int[] remove(int[] arr, int n) {
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int[] res=new int[set.size()];
        int j=0;
        for(int i:set){
            res[j++]=i;
        }
        return res;
    }
}
