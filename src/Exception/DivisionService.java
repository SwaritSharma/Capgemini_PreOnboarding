package Exception;

public class DivisionService {

    public static int performDivision(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return numerator / denominator;
    }

    public static int calculate(int numerator, int denominator) {
        try {
            return performDivision(numerator, denominator);
        } catch (ArithmeticException e) {
            throw new ArithmeticException(
                    "Error during division: " + numerator + " / " + denominator
            );
        }
    }
}

