package CollectionFramework;

import java.util.*;

public class RemoveDuplicates {
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new LinkedHashSet<>(list);
        return new ArrayList<>(seen);
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("Original List: " + input);
        List<Integer> result = removeDuplicates(input);
        System.out.println("Result (order preserved): " + result);
    }
}
