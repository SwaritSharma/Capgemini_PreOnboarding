package Level1;
import java.util.Scanner;

public class SimpleInterest {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Amount:");
        double principal = sc.nextDouble();

        System.out.println("Enter Rate of Interest:");
        double rate = sc.nextDouble();

        System.out.println("Enter Time (in years):");
        double time = sc.nextDouble();

        double si = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time + " years.");
    }
}
