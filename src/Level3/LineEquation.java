package Level3;
import java.util.Scanner;

public class LineEquation {

    static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double[] findLine(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLine(x1, y1, x2, y2);

        System.out.println("Distance: " + distance);
        System.out.println("Slope: " + line[0]);
        System.out.println("Y-Intercept: " + line[1]);
    }
}
