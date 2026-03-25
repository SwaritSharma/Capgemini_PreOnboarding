package Logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonSubString {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<String> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.next());
        }
        ArrayList<String> b=new ArrayList<>();
        for(int i=0;i<n;i++){
            b.add(sc.next());
        }
        System.out.println(Arrays.toString(check(a,b,n)));
    }

    private static String[] check(ArrayList<String> a, ArrayList<String> b, int n) {
        String[] arr=new String[n];
        Arrays.fill(arr,"No");
        for(int i=0;i<n;i++){
            if(a.get(i).contains(b.get(i))){
                arr[i]="Yes";
            }
        }
        return arr;
    }
}
