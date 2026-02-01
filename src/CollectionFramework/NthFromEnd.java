package CollectionFramework;

import java.util.*;

public class NthFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (list == null || n <= 0 || n > list.size()) {
            return null;
        }

        // Using two-pointer approach without calculating size explicitly (size is available in LinkedList, but the task says "without calculating its size" usually implying we should act as if we don't know it)
        ListIterator<T> first = list.listIterator();
        ListIterator<T> second = list.listIterator();

        // Move the first pointer n positions ahead
        for (int i = 0; i < n; i++) {
            if (first.hasNext()) {
                first.next();
            } else {
                return null;
            }
        }

        // Move both pointers until first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        System.out.println("List: " + list + ", N: " + n);
        String result = findNthFromEnd(list, n);
        System.out.println("Nth element from the end: " + result);
    }
}
