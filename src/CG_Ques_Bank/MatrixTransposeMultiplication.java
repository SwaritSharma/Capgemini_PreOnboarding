package CG_Ques_Bank;

import java.util.*;

public class MatrixTransposeMultiplication
{
    public static void transpose(int mat[][]){
        int r=mat.length,c=mat[0].length;
        int tmat[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                tmat[j][i]=mat[i][j];
        }

        System.out.println("Original matrix is: ");
        for(int m[]:mat)
            System.out.println(Arrays.toString(m));
        System.out.println();
        System.out.println("Transpose of matrix is: ");
        for(int a[]:tmat)
            System.out.println(Arrays.toString(a));
    }

    public static void multiplication(int mat1[][],int mat2[][]){
        int r1=mat1.length,r2=mat2.length,c1=mat1[0].length,c2=mat2[0].length;
        if(c1!=r2){
            System.out.println("Cannot be multiplied because number of colums" +
                    " for matrix 1 "+c1+" are not equal to the number of rows " +
                    "int matrix 2 "+r2);
            return;
        }
        int multi_mat[][]=new int[r1][c2];
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                int sum = 0;
                for (int k = 0; k < c1; k++)
                {
                    sum += mat1[i][k] * mat2[k][j];
                }
                multi_mat[i][j] = sum;
            }
        }
        System.out.println("Matrix 1");
        for(int m1[]:mat1)
            System.out.println(Arrays.toString(m1));
        System.out.println("Matrix 2");
        for(int m2[]:mat2)
            System.out.println(Arrays.toString(m2));

        System.out.println("Matrix after multiplication is :");
        for(int mm[]:multi_mat)
            System.out.println(Arrays.toString(mm));
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter the number of rows and columns for 1st matrix");
            int r1=sc.nextInt();
            int c1=sc.nextInt();
            int matrix1[][]=new int[r1][c1];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    System.out.println("Enter the element at row "+i+" and column "+j+" for matrix 1");
                    matrix1[i][j]=sc.nextInt();
                }
            }
            transpose(matrix1);
            System.out.println();
            System.out.println("Enter the number of rows and columns for 1st matrix");
            int r2=sc.nextInt();
            int c2=sc.nextInt();
            int matrix2[][]=new int[r2][c2];
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.println("Enter the element at row "+i+" and column "+j+" for matrix 1");
                    matrix2[i][j]=sc.nextInt();
                }
            }
            transpose(matrix2);
            multiplication(matrix1,matrix2);
            t--;
        }
    }
}
