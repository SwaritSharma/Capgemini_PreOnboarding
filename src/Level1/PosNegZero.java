package Level1;
import java.util.Scanner;

public class PosNegZero {

    public static int checkNumber(int number) {
        if (number > 0) return 1;
        if (number < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int result = checkNumber(number);

        if (result == 1)
            System.out.println("The number is Positive.");
        else if (result == -1)
            System.out.println("The number is Negative.");
        else
            System.out.println("The number is Zero.");
    }
}
