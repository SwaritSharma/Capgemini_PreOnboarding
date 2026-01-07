package Level3;

import java.util.Scanner;

public class CollinearPoints {

    static boolean checkBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    static boolean checkByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        System.out.println("Collinear by Slope: " + checkBySlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Collinear by Area: " + checkByArea(x1, y1, x2, y2, x3, y3));
    }
}
