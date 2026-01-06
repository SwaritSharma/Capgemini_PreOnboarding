package Level2;

import java.util.Scanner;

public class YoTallest {
    public static void findYoungestAndTallest(int age[], double height[]) {

        String names[] = {"Amar", "Akbar", "Anthony"};

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {

            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest Friend: " + names[youngestIndex] +
                " (Age: " + age[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallestIndex] +
                " (Height: " + height[tallestIndex] + ")");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age[] = new int[3];
        double height[] = new double[3];

        String names[] = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter age of " + names[i]);
            int a = sc.nextInt();

            System.out.println("Enter height of " + names[i]);
            double h = sc.nextDouble();

            if (a <= 0 || h <= 0) {
                System.out.println("Invalid input, enter again");
                i--;   // important Level2 trick
                continue;
            }

            age[i] = a;
            height[i] = h;
        }

        findYoungestAndTallest(age, height);
        sc.close();
    }

}
