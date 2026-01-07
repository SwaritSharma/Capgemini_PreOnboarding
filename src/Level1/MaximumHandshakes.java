package Level1;
import java.util.Scanner;

public class MaximumHandshakes {

    public static int calculateHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int students = sc.nextInt();

        int handshakes = calculateHandshakes(students);
        System.out.println("Maximum number of possible handshakes: " + handshakes);
    }
}
