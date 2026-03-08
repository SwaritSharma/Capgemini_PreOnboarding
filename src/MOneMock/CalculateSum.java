package MOneMock;

import java.util.Scanner;

public class CalculateSum {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        System.out.println(cal(m,n));
    }

    private static int cal(int m, int n) {
        int sum=0;

        while(m<=n){
            if(m % 3==0 && m % 5==0){
                sum+=m;
            }
            m++;
        }

        return sum;
    }
}
