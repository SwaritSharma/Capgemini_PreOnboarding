package Level2;
import java.util.Scanner;

public class UnitConvertor2 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length in yards:");
        double yards = sc.nextDouble();
        System.out.println("Yards to Feet: " + convertYardsToFeet(yards));

        System.out.println("Enter length in feet:");
        double feet = sc.nextDouble();
        System.out.println("Feet to Yards: " + convertFeetToYards(feet));

        System.out.println("Enter length in meters:");
        double meters = sc.nextDouble();
        System.out.println("Meters to Inches: " + convertMetersToInches(meters));

        System.out.println("Enter length in inches:");
        double inches = sc.nextDouble();
        System.out.println("Inches to Meters: " + convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(inches));
    }
}
