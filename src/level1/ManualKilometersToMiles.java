package level1;

import java.util.Scanner;

public class ManualKilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilometers;
        kilometers = scanner.nextDouble();
        double miles = kilometers * 1.6;
        System.out.println("The total miles is " + miles + " mile for given " + kilometers + " km");
        scanner.close();
    }
}
