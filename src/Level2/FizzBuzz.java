package Level2;
import java.util.*;
public class FizzBuzz
{
    public static void printFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter the number");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Not a positive integer");
            } else {
                printFizzBuzz(n);
            }
        }
    }
}
