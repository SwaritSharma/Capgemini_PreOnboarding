package Level1;
import java.util.Scanner;

public class TriangularParkRun {

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side 1 of the triangle (in meters):");
        double s1 = sc.nextDouble();

        System.out.println("Enter side 2 of the triangle (in meters):");
        double s2 = sc.nextDouble();

        System.out.println("Enter side 3 of the triangle (in meters):");
        double s3 = sc.nextDouble();

        double rounds = calculateRounds(s1, s2, s3);
        System.out.println("Number of rounds required to complete 5 km run: " + rounds);
    }
}
