package Level2;
import java.util.Scanner;

public class UnitConvertor1 {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in kilometers:");
        double km = sc.nextDouble();
        System.out.println("Kilometers to Miles: " + convertKmToMiles(km));

        System.out.println("Enter distance in miles:");
        double miles = sc.nextDouble();
        System.out.println("Miles to Kilometers: " + convertMilesToKm(miles));

        System.out.println("Enter distance in meters:");
        double meters = sc.nextDouble();
        System.out.println("Meters to Feet: " + convertMetersToFeet(meters));

        System.out.println("Enter distance in feet:");
        double feet = sc.nextDouble();
        System.out.println("Feet to Meters: " + convertFeetToMeters(feet));
    }
}
