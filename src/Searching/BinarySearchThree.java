package Searching;
import java.util.*;
public class BinarySearchThree {
    static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int r = mid / cols;
            int c = mid % cols;

            if (matrix[r][c] == target) {
                return true;
            } else if (target < matrix[r][c]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {

            System.out.print("\nEnter number of rows: ");
            int rows = sc.nextInt();

            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols];

            System.out.println("Enter matrix elements row-wise:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.print("Enter target value to search: ");
            int target = sc.nextInt();

            boolean found = searchMatrix(matrix, target);

            System.out.println("Result: " + found);
        }

        sc.close();
    }
}
