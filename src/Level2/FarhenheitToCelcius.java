package Level2;

import java.util.Scanner;
public class FarhenheitToCelcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double farhenheit = scanner.nextDouble();
        double celciusResult = (farhenheit - 32) * 5/9;
        System.out.println("The " + farhenheit + " farhenheit is " + celciusResult + " celcius");   
        scanner.close();
    }
}
