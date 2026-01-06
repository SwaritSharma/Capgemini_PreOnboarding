package Level1;

import java.util.Scanner;

public class MeanHeight {

    public static void findMean(double heights[]) {
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Mean height of the football team = " + mean);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double heights[] = new double[11];
        int i = 0;

        while (i < 11) {
            System.out.println("Enter height of player " + (i + 1));
            heights[i] = sc.nextDouble();
            i++;
        }

        findMean(heights);
        sc.close();
    }
}
