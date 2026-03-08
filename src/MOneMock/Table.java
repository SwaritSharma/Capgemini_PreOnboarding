package MOneMock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Table {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> tab=table(n);
        for(int i:tab){
            if(tab.get(tab.size()-1)==i){
                System.out.println(i);
            }else
                System.out.print(i+", ");
        }
        System.out.println(sum(tab));
    }

    private static int sum(ArrayList<Integer> tab) {
        int sum=0;
        for(int i:tab){
            sum+=i;
        }
        return  sum;
    }

    private static ArrayList<Integer> table(int n) {
        ArrayList<Integer> tab=new ArrayList<>();
        for(int i=1;i<=10;i++){
            tab.add(n*i);
        }
        return tab;
    }


}
