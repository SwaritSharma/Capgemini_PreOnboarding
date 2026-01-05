package Level1;

import java.util.Scanner;

public class MaxNumberOfHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + maxHandshakes + " if the number of students is " + numberOfStudents);
        scanner.close();
    }
}
