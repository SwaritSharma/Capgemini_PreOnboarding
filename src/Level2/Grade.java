package Level2;

import java.util.Scanner;

public class Grade {
    public static void calculateResult(
            int[][] marks,
            double[] percentage,
            char[] grade) {

        int students = marks.length;

        for (int i = 0; i < students; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            }
            else if (percentage[i] >= 70) {
                grade[i] = 'B';
            }
            else if (percentage[i] >= 60) {
                grade[i] = 'C';
            }
            else if (percentage[i] >= 50) {
                grade[i] = 'D';
            }
            else if (percentage[i] >= 40) {
                grade[i] = 'E';
            }
            else {
                grade[i] = 'R';
            }
        }

        System.out.println("\n--- STUDENT RESULT ---");
        for (int i = 0; i < students; i++) {
            System.out.println(
                    "Student " + (i + 1) +
                            " | Physics: " + marks[i][0] +
                            " | Chemistry: " + marks[i][1] +
                            " | Maths: " + marks[i][2] +
                            " | Percentage: " + String.format("%.2f", percentage[i]) +
                            " | Grade: " + grade[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students");
        int students = sc.nextInt();

        if (students <= 0) {
            System.out.println("Invalid number of students");
            return;
        }

        // marks[row][0] = Physics
        // marks[row][1] = Chemistry
        // marks[row][2] = Maths
        int[][] marks = new int[students][3];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        int i = 0;
        while (i < students) {

            System.out.println("Enter Physics marks of student " + (i + 1));
            int p = sc.nextInt();

            System.out.println("Enter Chemistry marks of student " + (i + 1));
            int c = sc.nextInt();

            System.out.println("Enter Maths marks of student " + (i + 1));
            int m = sc.nextInt();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks, enter positive values again");
                continue;   // index not increased
            }

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
            i++;
        }

        calculateResult(marks, percentage, grade);
        sc.close();
    }

}
