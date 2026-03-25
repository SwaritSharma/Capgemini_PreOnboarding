package Logical;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class SimilarStringPairs {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.println(count(arr,n));
    }

    private static int count(String[] arr, int n) {
        int count=0;
        for(int i=0;i<n;i++){
            TreeSet<Character> chars=new TreeSet<>();
            for(char c:arr[i].toCharArray()){
                chars.add(c);
            }
            for(int j=i+1;j<n;j++){
                TreeSet<Character> chars1=new TreeSet<>();
                for(char c:arr[j].toCharArray()){
                    chars1.add(c);
                }
                if(chars.equals(chars1)){
                    count++;
                }
            }
        }
        return count;
    }
}
