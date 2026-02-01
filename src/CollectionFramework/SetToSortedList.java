package CollectionFramework;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println("HashSet: " + hashSet);

        List<Integer> sortedList = new ArrayList<>(hashSet);
        Collections.sort(sortedList);

        System.out.println("Sorted List: " + sortedList);
    }
}
