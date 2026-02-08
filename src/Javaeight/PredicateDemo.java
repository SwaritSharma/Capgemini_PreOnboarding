package Javaeight;

import java.util.*;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("programming", "java", "streams", "lambda");

        Predicate<String> length = s -> s.length() > 5;
        Predicate<String> contains = s -> s.contains("a");

        list.stream()
                .filter(length.and(contains))
                .forEach(System.out::println);
    }
}

