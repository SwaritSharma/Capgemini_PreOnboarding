package level1;

public class DiscountFee {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        int discountAmount = fee * discountPercent / 100;
        System.out.println("The final fee after discount is " + (fee - discountAmount));
    }
}
