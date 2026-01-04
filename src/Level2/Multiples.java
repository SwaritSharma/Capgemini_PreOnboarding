package Level2;

import java.util.Scanner;

public class Multiples
{
    public static void printMultiples(int number) {
        System.out.println("Multiples of " + number + " below 100:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
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
            int n=sc.nextInt();

            if (n <= 0 || n >= 100) {
                System.out.println("Number must be a positive integer less than 100");
            } else {
                printMultiples(n);
            }
            t--;
        }
    }
}
