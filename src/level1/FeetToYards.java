package level1;

import java.util.Scanner;

public class FeetToYards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceInFeet = scanner.nextInt();
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMile = distanceInYards / 1760.0;
        System.out.println("Your distance in yards is " + distanceInYards + " yards and in miles is " + distanceInMile + " miles for given " + distanceInFeet + " feet");
        scanner.close();
    }
}
