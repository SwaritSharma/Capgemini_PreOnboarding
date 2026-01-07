package Level2;
import java.util.Scanner;

public class RandomNumber {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of random values to generate:");
        int size = sc.nextInt();

        int[] numbers = generate4DigitRandomArray(size);

        System.out.println("Generated 4 digit random numbers:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        double[] result = findAverageMinMax(numbers);

        System.out.println("\nAverage value: " + result[0]);
        System.out.println("Minimum value: " + (int) result[1]);
        System.out.println("Maximum value: " + (int) result[2]);
    }
}
