package Level3;

import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double weight, double heightCm)
    {
        if (weight <= 0 || heightCm <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI = " + bmi);

        if (bmi <= 18.4) {
            System.out.println("Status : Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status : Normal");
        }
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status : Overweight");
        }
        else {
            System.out.println("Status : Obese");
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();

        while (t > 0) {

            System.out.println("Enter weight in kg");
            double weight = sc.nextDouble();

            System.out.println("Enter height in cm");
            double height = sc.nextDouble();

            calculateBMI(weight, height);
            t--;
        }
    }
}
