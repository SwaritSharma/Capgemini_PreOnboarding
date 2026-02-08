package Javaeight;

import java.util.*;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 30, 20);

        Optional<Integer> max = list.stream().max(Integer::compare);

        System.out.println(max.orElseGet(() -> Integer.valueOf("List is empty")));
    }
}

