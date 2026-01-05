package Level2;

import java.util.Scanner;

public class GFactorTwo
{
    public static int findGreatestFactor(int number)
    {
        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        return greatestFactor;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if (n <= 1) {
                System.out.println("No greatest factor beside itself");
            } else {
                int result = findGreatestFactor(n);
                System.out.println("Greatest factor of " + n + " beside itself is " + result);
            }
            t--;
        }
    }
}
