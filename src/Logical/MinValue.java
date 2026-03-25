package Logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinValue {

    static void main() {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        int maxOperations=sc.nextInt();
        System.out.println(solve(al,maxOperations));
    }

    private static int solve(ArrayList<Integer> al, int maxOperations) {
        Collections.sort(al);
        if(maxOperations==0){
            return al.get(0);
        }
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<al.size()-1;i++){
            minDiff= Math.min(minDiff, Math.abs(al.get(i) - al.get(i + 1)));
        }
        if(maxOperations==1){
            return minDiff;
        }
        return 0;
    }
}
