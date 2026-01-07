package Level1;
import java.util.Scanner;

public class ChillWind {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature (in Fahrenheit):");
        double temp = sc.nextDouble();

        System.out.println("Enter wind speed:");
        double windSpeed = sc.nextDouble();

        System.out.println("Wind Chill Temperature is: " + calculateWindChill(temp, windSpeed));
    }
}
