package Level1;

import java.util.Scanner;

public class UntillZeroOrNeg
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num;
        System.out.print("Enter a number or 0 or Negative to stop: ");
        num = sc.nextDouble();
        while (num > 0 ) {
            total = total + num;
            System.out.print("Enter a number or 0 or Negative to stop: ");
            num = sc.nextDouble();
            if(num<0)break;
        }
        System.out.println("Total sum = " + total);
    }
}
