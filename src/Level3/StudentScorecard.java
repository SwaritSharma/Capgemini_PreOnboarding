package Level3;

import java.util.Scanner;

public class StudentScorecard {

    static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = (int)(Math.random() * 90) + 10;
            marks[i][1] = (int)(Math.random() * 90) + 10;
            marks[i][2] = (int)(Math.random() * 90) + 10;
        }
        return marks;
    }

    static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3;
            double percent = (total / 300) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    static void displayScorecard(int[][] marks, double[][] result) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[][] marks = generateMarks(students);
        double[][] result = calculateResults(marks);

        displayScorecard(marks, result);
    }
}
