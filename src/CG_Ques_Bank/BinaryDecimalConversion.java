package CG_Ques_Bank;

import java.util.Scanner;

public class BinaryDecimalConversion
{
    public static void bTod(String bi){
        int dec=0,n=bi.length();
        for(int i=0;i<n;i++){
            int p=(int)Math.pow(2,n-i-1);
            dec+=bi.charAt(i)=='1'?p:0;
        }
        System.out.println("Decimal value of "+bi+" is : "+dec);
    }
    public static void dTob(int n){
        int temp=n;
        String bi="";
        while(n!=0){
            bi=(n % 2)+bi;
            n=n/2;
        }
        System.out.println("Binary value for "+temp+" is : "+bi);
    }
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            System.out.println("Enter the binary value");
            String s=sc.nextLine();
            System.out.println("Enter the decimal value");
            int n=sc.nextInt();
            dTob(n);
            bTod(s);
            t--;
        }
    }
}
