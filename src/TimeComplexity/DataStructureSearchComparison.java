package TimeComplexity;
import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int[] sizes = { 1000, 100000 };
        for (int n : sizes) {
            int[] arr = new int[n];
            HashSet<Integer> set = new HashSet<>();
            TreeSet<Integer> tree = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                arr[i] = i;
                set.add(i);
                tree.add(i);
            }

            int target = n - 1;

            long start = System.nanoTime();
            for (int x : arr)
                if (x == target)
                    break;
            long end = System.nanoTime();
            System.out.println("N: " + n + ", Array Search: " + (end - start) / 1_000_000.0 + "ms");

            start = System.nanoTime();
            set.contains(target);
            end = System.nanoTime();
            System.out.println("N: " + n + ", HashSet Search: " + (end - start) / 1_000_000.0 + "ms");

            start = System.nanoTime();
            tree.contains(target);
            end = System.nanoTime();
            System.out.println("N: " + n + ", TreeSet Search: " + (end - start) / 1_000_000.0 + "ms");
        }
    }
}
