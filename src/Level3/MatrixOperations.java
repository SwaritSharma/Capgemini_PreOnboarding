package Level3;

public class MatrixOperations {

    static int[][] generateMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = (int)(Math.random() * 10);
            }
        }
        return m;
    }

    static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }

    static int[][] subtract(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }

    static int[][] transpose(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }

    static int det2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    static int det3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    static double[][] inverse2x2(int[][] m) {
        double det = det2x2(m);
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    static void display(int[][] m) {
        for (int[] r : m) {
            for (int x : r) System.out.print(x + " ");
            System.out.println();
        }
    }

    static void displayDouble(double[][] m) {
        for (double[] r : m) {
            for (double x : r) System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] a = generateMatrix(2, 2);
        int[][] b = generateMatrix(2, 2);

        System.out.println("Matrix A");
        display(a);

        System.out.println("Matrix B");
        display(b);

        System.out.println("Addition");
        display(add(a, b));

        System.out.println("Subtraction");
        display(subtract(a, b));

        System.out.println("Multiplication");
        display(multiply(a, b));

        System.out.println("Transpose of A");
        display(transpose(a));

        System.out.println("Determinant of A");
        System.out.println(det2x2(a));

        System.out.println("Inverse of A");
        displayDouble(inverse2x2(a));
    }
}
