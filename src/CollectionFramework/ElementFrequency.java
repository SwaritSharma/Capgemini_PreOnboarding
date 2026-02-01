package CollectionFramework;

import java.util.*;

public class ElementFrequency {
    public static Map<String, Integer> findFrequency(List<String> input) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String str : input) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println("Input: " + input);
        Map<String, Integer> result = findFrequency(input);
        System.out.println("Output: " + result);
    }
}
