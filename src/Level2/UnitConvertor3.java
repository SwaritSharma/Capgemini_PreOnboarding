package Level2;
import java.util.Scanner;

public class UnitConvertor3 {

    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit:");
        double f = sc.nextDouble();
        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(f));

        System.out.println("Enter temperature in Celsius:");
        double c = sc.nextDouble();
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(c));

        System.out.println("Enter weight in pounds:");
        double pounds = sc.nextDouble();
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(pounds));

        System.out.println("Enter weight in kilograms:");
        double kg = sc.nextDouble();
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(kg));

        System.out.println("Enter volume in gallons:");
        double gallons = sc.nextDouble();
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(gallons));

        System.out.println("Enter volume in liters:");
        double liters = sc.nextDouble();
        System.out.println("Liters to Gallons: " + convertLitersToGallons(liters));
    }
}
