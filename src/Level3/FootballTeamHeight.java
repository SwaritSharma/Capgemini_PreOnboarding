package Level3;

import java.util.Random;

public class FootballTeamHeight {

    static int[] generateHeights() {
        int[] heights = new int[11];
        Random r = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = r.nextInt(101) + 150;
        }
        return heights;
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    static int findShortest(int[] arr) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }

    static int findTallest(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();

        System.out.print("Heights: ");
        for (int x : heights) System.out.print(x + " ");
        System.out.println();

        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}
