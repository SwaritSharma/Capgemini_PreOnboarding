package Level2;

import java.util.Scanner;

public class FactorsTwo
{
    public static void printFactors(int number) {
        System.out.println("Factors of " + number + " are:");
        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0)
        {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Not a positive integer");
            } else {
                printFactors(number);
            }
            t--;
        }
    }
}
