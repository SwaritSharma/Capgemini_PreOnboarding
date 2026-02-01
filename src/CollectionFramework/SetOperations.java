package CollectionFramework;

import java.util.*;

public class SetOperations {
    public static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        return set1.equals(set2);
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> union = union(set1, set2);
        Set<T> intersection = intersection(set1, set2);
        union.removeAll(intersection);
        return union;
    }

    public static <T> boolean isSubset(Set<T> subset, Set<T> superset) {
        return superset.containsAll(subset);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        System.out.println("Set1: " + set1 + ", Set2: " + set2);
        System.out.println("Are Sets Equal: " + areSetsEqual(set1, set2));

        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5));
        System.out.println("\nSetA: " + setA + ", SetB: " + setB);
        System.out.println("Union: " + union(setA, setB));
        System.out.println("Intersection: " + intersection(setA, setB));
        System.out.println("Symmetric Difference: " + symmetricDifference(setA, setB));

        Set<Integer> subset = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> superset = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("\nIs {2, 3} subset of {1, 2, 3, 4}: " + isSubset(subset, superset));
    }
}
