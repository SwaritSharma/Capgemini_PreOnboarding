package MOneMock;

import java.util.Scanner;

public class CountCarries {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt();
        System.out.println(count(num1,num2));
    }

    private static int count(int num1, int num2) {
        int count=0;
        int carry=0;
        while(num1!=0 || num2!=0){
            int d1=num1 % 10;
            int d2=num2 % 10;
            if(d1+d2+carry>9){
                count++;
                carry=(d1+d2+carry)/10;
            }
            num1/=10;
            num2/=10;
        }
        return count;
    }
}
