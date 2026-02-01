package CollectionFramework;

import java.util.*;

public class MergeMaps {
    public static Map<String, Integer> merge(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);
        map2.forEach((k, v) -> result.merge(k, v, Integer::sum));
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("A", 1);
        m1.put("B", 2);

        Map<String, Integer> m2 = new HashMap<>();
        m2.put("B", 3);
        m2.put("C", 4);

        System.out.println("Map1: " + m1);
        System.out.println("Map2: " + m2);
        System.out.println("Merged: " + merge(m1, m2));
    }
}
