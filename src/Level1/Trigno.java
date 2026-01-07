package Level1;
import java.util.Scanner;

public class Trigno {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{
                Math.sin(radians),
                Math.cos(radians),
                Math.tan(radians)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter angle in degrees:");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sine value is: " + result[0]);
        System.out.println("Cosine value is: " + result[1]);
        System.out.println("Tangent value is: " + result[2]);
    }
}
