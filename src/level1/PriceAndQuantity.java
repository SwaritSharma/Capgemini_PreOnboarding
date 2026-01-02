package level1;

import java.util.Scanner;
public class PriceAndQuantity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unitPrice = scanner.nextInt();
        int quantity = scanner.nextInt();
        System.out.println("The total purchase is INR " + (unitPrice * quantity) + " if the quantity " + quantity + "  and unit price is INR");
        scanner.close();
    }
}
