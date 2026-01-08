package Level3_8_01_2026;

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        System.out.println("Enter weight(kg) and height(cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        String[][] bmiResults = calculateBMI(data);
        displayBMI(bmiResults);
        sc.close();
    }
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";
            results[i][0] = String.valueOf(heightCm);
            results[i][1] = String.valueOf(weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }
    public static void displayBMI(String[][] data) {
        System.out.print("Height\tWeight\tBMI\tStatus\n");
        for (String[] person : data) {
            System.out.print(person[0] + "\t" + person[1] + "\t" + person[2] + "\t" + person[3] + "\n");
        }
    }
}
