package Level2;
import java.util.Scanner;

public class StudentVote {

    public static boolean canStudentVote(int age) {
        if (age <= 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {

            while (true) {
                System.out.println("Enter age of student " + (i + 1) + ":");
                ages[i] = sc.nextInt();

                if (ages[i] <= 0) {
                    System.out.println("Invalid age! Age must be greater than 0. Please re-enter.");
                } else {
                    break;
                }
            }

            if (canStudentVote(ages[i])) {
                System.out.println("Student is eligible to vote.");
            } else {
                System.out.println("Student is NOT eligible to vote.");
            }
        }
    }
}
