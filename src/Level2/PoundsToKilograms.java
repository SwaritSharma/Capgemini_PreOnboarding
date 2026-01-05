package Level2;

import java.util.Scanner;
class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = scanner.nextDouble();
        double kilograms = pounds / 2.2;
        System.out.println("The weight of person in pound is " + pounds + " and in kilograms is " + kilograms);
        scanner.close();
    }    
}
