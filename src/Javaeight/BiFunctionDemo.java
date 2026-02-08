package Javaeight;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<String, String, String> concat =
                (a, b) -> a + " " + b;

        System.out.println(concat.apply("Hello", "World"));
    }
}
