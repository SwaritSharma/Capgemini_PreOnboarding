package Level2;

import java.util.Scanner;

public class BMICal {
    public static void calculateBMI(double weight[], double height[]) {

        int n = weight.length;

        double bmi[] = new double[n];
        String status[] = new String[n];

        for (int i = 0; i < n; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            }
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            }
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            }
            else {
                status[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Person " + (i + 1) +
                            " | Height: " + height[i] +
                            " | Weight: " + weight[i] +
                            " | BMI: " + String.format("%.2f", bmi[i]) +
                            " | Status: " + status[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of persons");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of persons");
            return;
        }

        double weight[] = new double[n];
        double height[] = new double[n];

        int i = 0;
        while (i < n) {

            System.out.println("Enter weight (kg) of person " + (i + 1));
            double w = sc.nextDouble();

            System.out.println("Enter height (meters) of person " + (i + 1));
            double h = sc.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Invalid input, enter again");
                continue;   // index not increased
            }

            weight[i] = w;
            height[i] = h;
            i++;
        }

        calculateBMI(weight, height);
        sc.close();
    }

}
