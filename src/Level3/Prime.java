package Level3;
import java.util.Scanner;
public class Prime {
    public static void checkPrime(int n)
    {
        if (n <= 1) {
            System.out.println(n + " Is Not a Prime Number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " Is a Prime Number");
        } else {
            System.out.println(n + " Is Not a Prime Number");
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();

        while (t > 0) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            checkPrime(n);
            t--;
        }
    }
}
