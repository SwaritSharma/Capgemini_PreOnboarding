package MOneMock;

import java.util.Scanner;

public class MaxExponents {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println(exponents(a,b));
    }

    private static int exponents(int a, int b) {
        int max=0;

        int expMax=0;
        for(int i=b;i>=a;i--){
            if(i % 2==0){
                int temp=i;
                int powerOf=0;
                while(temp!=0 && temp % 2==0){
                    powerOf++;
                    temp=temp/2;
                }
                if(powerOf>expMax){
                    expMax=powerOf;
                    max=i;
                }
            }
        }
        return max;
    }
}
