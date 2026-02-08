package Javaeight;

import java.util.*;
import java.util.stream.*;

public class SecondMostRepeated {
    public static void main(String[] args) {
        String text = "java java streams lambda streams java";

        List<Map.Entry<String, Long>> list =
                Arrays.stream(text.split("\\W+"))
                        .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
                        .entrySet().stream()
                        .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                        .collect(Collectors.toList());

        if (list.size() > 1)
            System.out.println("Second most repeated: " + list.get(1));
    }
}

