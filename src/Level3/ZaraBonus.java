package Level3;

public class ZaraBonus {

    static int[][] generateEmployeeData() {
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    static double[][] calculateNewSalary(int[][] data) {
        double[][] result = new double[10][3];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            int years = data[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            result[i][0] = salary;
            result[i][1] = salary + bonus;
            result[i][2] = bonus;
        }
        return result;
    }

    static void displayTotals(double[][] result) {
        double oldSum = 0, newSum = 0, bonusSum = 0;
        for (double[] row : result) {
            oldSum += row[0];
            newSum += row[1];
            bonusSum += row[2];
        }
        System.out.println("Total Old Salary: " + oldSum);
        System.out.println("Total New Salary: " + newSum);
        System.out.println("Total Bonus: " + bonusSum);
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployeeData();
        double[][] salaryData = calculateNewSalary(employees);

        System.out.println("OldSalary\tNewSalary\tBonus");
        for (double[] row : salaryData) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }

        displayTotals(salaryData);
    }
}
