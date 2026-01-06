package Level1;

import java.util.Scanner;

public class CopyArr {
    public static void copyArray(int matrix[][], int rows, int columns) {

        int array[] = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("Elements in 1D Array:");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element at [" + i + "][" + j + "]");
                matrix[i][j] = sc.nextInt();
            }
        }

        copyArray(matrix, rows, columns);
        sc.close();
    }

}
