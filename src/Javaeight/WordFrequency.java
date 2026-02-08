package Javaeight;


import java.util.*;
import java.util.stream.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "java streams java lambda streams java";

        Map<String, Long> freq =
                Arrays.stream(text.toLowerCase().split("\\W+"))
                        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        freq.entrySet().stream()
                .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                .limit(3)
                .forEach(System.out::println);
    }
}

