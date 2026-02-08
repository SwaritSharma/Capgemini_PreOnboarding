package Javaeight;

public class SumDemo {
    public static void main(String[] args) {
        Sum s = (a, b) -> a + b;
        System.out.println("Sum = " + s.add(10, 20));
    }
}
