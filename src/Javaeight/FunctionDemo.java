package Javaeight;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Double, Double> area =
                r -> Math.PI * r * r;

        System.out.println("Area = " + area.apply(7.0));
    }
}

