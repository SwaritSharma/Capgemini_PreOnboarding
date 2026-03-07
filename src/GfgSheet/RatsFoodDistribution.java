package GfgSheet;

import java.util.Scanner;

public class RatsFoodDistribution {
    static void sufficient(int rats,int units,int[] houses){
        int totalReq=rats * units;
        int obtained=0;
        for(int i=0;i<houses.length;i++){
            if(obtained>=totalReq){
                System.out.println(i);
                return;
            }
            obtained+=houses[i];
        }
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int rats=sc.nextInt();
        int units=sc.nextInt();
        int n=sc.nextInt();
        int[] houses=new int[n];
        for(int i=0;i<n;i++){
            houses[i]= sc.nextInt();
        }
        sufficient(rats,units,houses);
    }
}
