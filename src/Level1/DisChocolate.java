package Level1;
import java.util.Scanner;

public class DisChocolate {

    public static int[] distributeChocolates(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of chocolates:");
        int chocolates = sc.nextInt();

        System.out.println("Enter number of children:");
        int children = sc.nextInt();

        int[] result = distributeChocolates(chocolates, children);

        System.out.println("Each child will get: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
