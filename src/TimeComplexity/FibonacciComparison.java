package TimeComplexity;

public class FibonacciComparison {
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] tests = { 10, 30, 40 };
        for (int n : tests) {
            long start = System.currentTimeMillis();
            fibonacciRecursive(n);
            long end = System.currentTimeMillis();
            System.out.println("N: " + n + ", Recursive: " + (end - start) + "ms");

            start = System.nanoTime();
            fibonacciIterative(n);
            end = System.nanoTime();
            System.out.println("N: " + n + ", Iterative: " + (end - start) / 1_000_000.0 + "ms");
            System.out.println("-------------------------");
        }
    }
}
