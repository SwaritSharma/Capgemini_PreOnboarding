package Level2;

import java.util.Scanner;

public class GFactor
{
    public static int findGreatestFactor(int number)
    {
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        return greatestFactor;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.println("Enter the number");
            int n=sc.nextInt();
            if (n <= 1) {
                System.out.println("No greatest factor beside itself");
            }
            else {
                int result = findGreatestFactor(n);
                System.out.println("Greatest factor of " + n + " beside itself is " + result);
            }
            t--;
        }
    }
}
