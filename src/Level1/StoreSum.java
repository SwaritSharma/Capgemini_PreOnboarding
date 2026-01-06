package Level1;

import java.util.Scanner;

public class StoreSum {

    public static void storeAndSum(double arr[]) {
        double total = 0.0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            System.out.println("Element " + (i + 1) + " : " + arr[i]);
        }

        System.out.println("Total sum = " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[10];
        int index = 0;

        while (true) {
            System.out.println("Enter a number");
            double num = sc.nextDouble();

            if (num <= 0)
                break;

            if (index == 10)
                break;

            arr[index] = num;
            index++;
        }

        storeAndSum(arr);
        sc.close();
    }
}
