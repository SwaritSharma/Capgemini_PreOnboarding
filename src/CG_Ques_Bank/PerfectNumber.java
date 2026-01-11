package CG_Ques_Bank;

import java.util.Scanner;

public class PerfectNumber {
    public static void perfectNumber(int n){
        int sum=0;
        for(int i=1;i<n-1;i++){
            if(n % i == 0){
                sum+=i;
            }
        }
        if(sum==n) {
            System.out.println(n+" is a Perfect number");
            return;
        }
        else {
            System.out.println(n+" is not a Perfect Number");
        }
    }
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the number");
            int n=sc.nextInt();
            perfectNumber(n);
            t--;
        }
    }
}
