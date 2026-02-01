package CollectionFramework;

import java.util.*;

public class WordFrequency {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> freq = new HashMap<>();
        String[] words = text.toLowerCase().split("\\W+");
        for (String word : words) {
            if (!word.isEmpty()) {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        System.out.println("Input: " + input);
        System.out.println("Word Frequencies: " + countWords(input));
    }
}
