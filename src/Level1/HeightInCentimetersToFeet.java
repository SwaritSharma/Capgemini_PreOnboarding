package Level1;

import java.util.Scanner;

public class HeightInCentimetersToFeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightInCentimeters = scanner.nextInt();
        double totalInches = heightInCentimeters / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        System.out.println("Your height in cm is " + heightInCentimeters + " while in feet is " + feet + " and inches is " + inches);
        scanner.close();
    }
}
