package Stack_Queue_HashMap_HashingFunction;

import java.util.Stack;
import java.util.Arrays;

public class StockSpan {
    public static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && price[s.peek()] <= price[i]) {
                s.pop();
            }
            span[i] = (s.isEmpty()) ? (i + 1) : (i - s.peek());
            s.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] price = { 100, 80, 60, 70, 60, 75, 85 };
        int[] span = calculateSpan(price);
        System.out.println(Arrays.toString(span));
    }
}
