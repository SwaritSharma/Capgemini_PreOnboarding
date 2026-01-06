package Level1;

import java.util.Scanner;

public class ArrMultiplicationTwo
{
    public static void multi(int number, int arr[]) {
        int index = 0;

        for (int i = 6; i <= 9; i++) {
            arr[index] = number * i;
            index++;
        }

        int j = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + arr[j]);
            j++;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        int multiplicationResult[] = new int[4];

        multi(number, multiplicationResult);
    }
}
