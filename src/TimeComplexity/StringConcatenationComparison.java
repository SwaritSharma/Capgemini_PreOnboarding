package TimeComplexity;

public class StringConcatenationComparison {
    public static void testString(int n) {
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
            s += "a";
        long end = System.currentTimeMillis();
        System.out.println("String (N=" + n + "): " + (end - start) + "ms");
    }

    public static void testStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
            sb.append("a");
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder (N=" + n + "): " + (end - start) + "ms");
    }

    public static void testStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++)
            sb.append("a");
        long end = System.currentTimeMillis();
        System.out.println("StringBuffer (N=" + n + "): " + (end - start) + "ms");
    }

    public static void main(String[] args) {
        int[] sizes = { 1000, 10000, 50000 }; // Using 50k as String becomes very slow
        for (int n : sizes) {
            testString(n);
            testStringBuilder(n);
            testStringBuffer(n);
        }
    }
}
