package CollectionFramework;

import java.util.*;

public class RotateList {
    public static <T> void rotate(List<T> list, int positions) {
        if (list == null || list.isEmpty()) return;
        int size = list.size();
        positions = positions % size;
        if (positions == 0) return;

        // Using subLists to rotate
        List<T> rotated = new ArrayList<>(list.subList(positions, size));
        rotated.addAll(list.subList(0, positions));
        
        for (int i = 0; i < size; i++) {
            list.set(i, rotated.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Original List: " + input);
        rotate(input, 2);
        System.out.println("Rotated by 2: " + input);
    }
}
