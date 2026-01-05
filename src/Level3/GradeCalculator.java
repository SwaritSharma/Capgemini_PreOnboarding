package Level3;

import java.util.Scanner;

public class GradeCalculator {

    public static void calculateResult(int phy, int chem, int maths)
    {
        if (phy < 0 || chem < 0 || maths < 0 ||
                phy > 100 || chem > 100 || maths > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        int total = phy + chem + maths;
        double average = total / 3.0;

        System.out.println("Average Marks = " + average);

        if (average >= 80) {
            System.out.println("Grade : A");
            System.out.println("Remarks : Level 4, above agency-normalized standards");
        }
        else if (average >= 70) {
            System.out.println("Grade : B");
            System.out.println("Remarks : Level 3, at agency-normalized standards");
        }
        else if (average >= 60) {
            System.out.println("Grade : C");
            System.out.println("Remarks : Level 2, below but approaching standards");
        }
        else if (average >= 50) {
            System.out.println("Grade : D");
            System.out.println("Remarks : Level 1, well below standards");
        }
        else if (average >= 40) {
            System.out.println("Grade : E");
            System.out.println("Remarks : Too below agency-normalized standards");
        }
        else {
            System.out.println("Grade : R");
            System.out.println("Remarks : Remedial standards");
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases");
        int t = sc.nextInt();

        while (t > 0) {

            System.out.println("Enter Physics marks");
            int phy = sc.nextInt();

            System.out.println("Enter Chemistry marks");
            int chem = sc.nextInt();

            System.out.println("Enter Maths marks");
            int maths = sc.nextInt();

            calculateResult(phy, chem, maths);
            t--;
        }
    }
}
