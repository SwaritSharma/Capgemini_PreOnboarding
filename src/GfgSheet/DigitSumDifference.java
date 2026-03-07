package GfgSheet;

import java.util.Scanner;

public class DigitSumDifference {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        diff(m,n);
    }

    private static void diff(int m, int n) {
        int x=0;
        int y=0;
        for(int i=m;i<=n;i++){
            if(i % 4==0){
                x+=sumOfDigits(i);
            }
            if(i % 7==0){
                y+=sumOfDigits(i);
            }
        }
        System.out.println(Math.abs(x-y));
    }

    private static int sumOfDigits(int i) {
        int sum=0;
        while(i!=0){
            sum+=i % 10;
            i=i/10;
        }
        return sum;
    }
}
