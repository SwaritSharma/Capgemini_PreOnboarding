package MOneMock;

import java.util.Scanner;

public class DifferenceSum {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.println(differenceOfSum(n,m));
    }

    private static int differenceOfSum(int n, int m) {
        int divBy=0,notDiv=0;
        for(int i=1;i<=m;i++){
            if(i % n==0){
                divBy+=i;
            }
            else{
                notDiv+=i;
            }
        }
        int max= (divBy > notDiv) ? divBy : notDiv;
        int min= (divBy < notDiv) ? divBy : notDiv;

        return max-min;
    }
}
