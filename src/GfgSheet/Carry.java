package GfgSheet;

import java.util.Scanner;

public class Carry {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        countCarry(num1,num2);
    }

    private static void countCarry(int num1, int num2) {
        int carryCount=0;
        int carry=0;
        while(num1 !=0 || num2!=0){
            int d1=num1 % 10;
            int d2=num2 % 10;
            int sum=d1+d2+carry;
            if(sum>9){
                carryCount++;
            }
            carry=sum/10;
            num1=num1/10;
            num2=num2/10;
        }
        System.out.println(carryCount);
    }
}
