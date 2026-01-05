package Level1;

import java.util.Scanner;

public class ManualDiscountFee {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int fee = scanner.nextInt();
        int discountPercent = scanner.nextInt();
        int discountAmount = fee * discountPercent / 100;
        System.out.println("The discount amount is " + discountAmount + " and the final fee after discount is INR " + (fee - discountAmount));
        scanner.close();
    }
}
