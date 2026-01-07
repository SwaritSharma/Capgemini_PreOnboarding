package Level2;
import java.util.Scanner;

public class BMICalV2
{

    public static double calculateBMI(double weightKg, double heightCm) {
        double heightMeter = heightCm / 100;
        return weightKg / (heightMeter * heightMeter);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi >= 18.5 && bmi <= 24.9)
            return "Normal";
        else if (bmi >= 25.0 && bmi <= 39.9)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter details of Person " + (i + 1));

            System.out.println("Enter weight in kg:");
            data[i][0] = sc.nextDouble();

            System.out.println("Enter height in cm:");
            data[i][1] = sc.nextDouble();

            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            status[i] = getBMIStatus(data[i][2]);
        }

        System.out.println("----- BMI REPORT -----");

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + data[i][0] + " kg");
            System.out.println("Height: " + data[i][1] + " cm");
            System.out.println("BMI: " + String.format("%.2f", data[i][2]));
            System.out.println("Status: " + status[i]);
            System.out.println("----------------------");
        }
    }
}
