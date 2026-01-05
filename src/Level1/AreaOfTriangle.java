package Level1;

import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int height = scanner.nextInt();
        System.out.println("Your triangle area is " + (base * height) / 2 + " square units");
        scanner.close();
    }
}
