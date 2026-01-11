package CG_Ques_Bank;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean prime(int n){
        if(n<=1)return false;
        for(int i=2;i<=n/2;i++){
            if(n % i==0)return false;
        }
        return true;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the number");
            int n=sc.nextInt();
            System.out.println(prime(n)==true?n+" is Prime":n+" is not Prime");
            t--;
        }
    }
}
