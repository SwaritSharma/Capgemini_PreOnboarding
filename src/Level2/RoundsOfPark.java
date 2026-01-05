package Level2;

import java.util.Scanner;

public class RoundsOfPark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        int perimeter = side1 + side2 + side3;
        int totalRounds = perimeter / 5000;
        System.out.println("The total number of rounds the athelete will run is " + totalRounds + " to complete 5km");
        scanner.close();
    }
}
