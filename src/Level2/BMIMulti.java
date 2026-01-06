package Level2;

import java.util.Scanner;

public class BMIMulti {
    public static void calculateBMI(double[][] personData, String[] weightStatus) {

        int number = personData.length;

        for (int i = 0; i < number; i++) {

            double weight = personData[i][0];
            double height = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            }
            else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < number; i++) {
            System.out.println(
                    "Person " + (i + 1) +
                            " | Weight: " + personData[i][0] +
                            " | Height: " + personData[i][1] +
                            " | BMI: " + String.format("%.2f", personData[i][2]) +
                            " | Status: " + weightStatus[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of persons");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number of persons");
            return;
        }


        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        int i = 0;
        while (i < number) {

            System.out.println("Enter weight (kg) of person " + (i + 1));
            double weight = sc.nextDouble();

            System.out.println("Enter height (meters) of person " + (i + 1));
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input, enter positive values");
                continue;   // i not increased
            }

            personData[i][0] = weight;
            personData[i][1] = height;
            i++;
        }

        calculateBMI(personData, weightStatus);
        sc.close();
    }

}
