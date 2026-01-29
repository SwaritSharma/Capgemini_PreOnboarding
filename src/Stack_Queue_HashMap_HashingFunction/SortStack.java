package Stack_Queue_HashMap_HashingFunction;

import java.util.Stack;

public class SortStack {
    public static void sort(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sort(s);
            insertSorted(s, x);
        }
    }

    private static void insertSorted(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
        } else {
            int temp = s.pop();
            insertSorted(s, x);
            s.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        System.out.println("Stack before sorting: " + s);
        sort(s);
        System.out.println("Stack after sorting: " + s);
    }
}
